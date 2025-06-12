package pruebas.ordinaria.gasolinera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>(); 
	private static Map<String,List<Comprobante>> clientes= new HashMap<String,List<Comprobante>>();
	private static List<Comprobante> repostajes = new ArrayList<Comprobante>();
	private static final Scanner entrada = new Scanner(System.in);
	private static List<Deposito> depositos = new ArrayList<Deposito>();
	
	
	
	public static void main(String[] args) {
	
		
		 inicializarDepositos();
		 leerDatosFichero();
		 login();
		 

	}
	
	
	

	private static void inicializarDepositos() {
		
	 Deposito depositoDiesel = new Deposito(1,"diesel", 1200, 0,1.4);	
	 Deposito depositoGasolina = new Deposito(2,"gasolina", 1000, 0,1.5); 
	 Deposito depositoGas = new Deposito(3,"gas", 500, 0,0.8);
	 
	 depositos.add(depositoDiesel);
	 depositos.add(depositoGasolina);
	 depositos.add(depositoGas);
		
	}
	
	private static void obtenerEstadoDepositos() {
		
		System.out.println("----DEPOSITOS----");
		for(Deposito deposito: depositos) {
			System.out.println("Producto:"+deposito.getProducto());
			System.out.println("Capacidad máxima:"+deposito.getCapacidad());
			System.out.println("Consumo:"+deposito.getConsumo());
			System.out.println("Disponible:"+deposito.obtenerCapacidadActual());
			System.out.println("-----------------------");
		}
		
	}

	private static void login() {
		String nombre;
		String pass;
		
		System.out.println("---------------------");
		System.out.println("NOMBRE:");
		nombre = entrada.next();
		System.out.println("PASS:");
		pass= entrada.next();
		
		
		if(!nombre.equals("") && !pass.equals("")) {
			comprobarUsuario(nombre,pass);
		}else {
			System.out.println("Datos incompletos");
		}
				
		
	}

	private static void comprobarUsuario(String nombre, String pass) {
		
		
		 boolean encontrado= false;
		 Usuario usuario=null;
		 Iterator it = usuarios.iterator();
		 while(it.hasNext() && !encontrado) {
			 usuario = (Usuario)it.next();
			 if(usuario.getNombre().equals(nombre) &&
					 usuario.getPass().equals(pass)) {
				     encontrado = true;
			 }
		 } // fin del recorrido
		 
		 obtenerTipoUsuario(encontrado, usuario);
		
	}

	private static void obtenerTipoUsuario(boolean encontrado, Usuario usuario) {
		
		if(encontrado) {
			 if(usuario.getPerfil().equals(Constantes.CLIENTE)) {
				 operarCliente(usuario);
				 
			 }else {
				 operarAdmin();
				
			 }
		 }else {
			 System.out.println("Usuario no encontrado");
		 }
	}

	private static void operarAdmin() {
		// TODO Auto-generated method stub
		
	}

	private static void operarCliente(Usuario usuario) {
		
		
		  int opcion=0;
		  do {
			  
			  mostrarMenuCliente();
			  opcion=entrada.nextInt();
			  
			  switch (opcion) {
			case 1:
				  repostar(usuario.getNombre());
				break;
			case 2:
				  verComprobantes(usuario.getNombre());
				break;
			case 3:
				 System.out.println("Gracias");
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}
			  
		  }while(opcion!=3);
		
	}

	private static void verComprobantes(String nombreCliente) {
		
		//RECORRER LA LISTA 
		 for(Comprobante comprobante: repostajes) {
			 
			 if(comprobante.getNombreCliente().equals(nombreCliente)) {
				 System.out.println(comprobante);
			 }
		 }
		
		//OBTENER LISTA DEL MAPA
		 List<Comprobante> listaCliente =  clientes.get(nombreCliente);
         for(Comprobante comprobante: listaCliente) {
				 System.out.println(comprobante);
		 }
		
	}

	private static void repostar(String nombre) {
		
		
		obtenerEstadoDepositos();
		
		System.out.println("--Hola "+nombre+" ¿Qué producto desea?--");
		System.out.println("1.Diesel");
		System.out.println("2.Gasolina");
		System.out.println("3.Gas");
		
		int tipoProducto = entrada.nextInt();
		double litros;
		if(tipoProducto>=1 && tipoProducto<=3) {
			
			System.out.println("Litros:");
			litros = entrada.nextDouble();
			
			if(litros>0) {

				actualizarEstadoDeposito(tipoProducto,litros);
				
				String producto = Deposito.obtenerNombreTipoProducto(tipoProducto);
				double precioL = obtenerPrecioLitroProducto(tipoProducto);
				double importeBruto = litros*precioL;
				double descuentoCantidad = obtenerDescuentoPorCantidad(importeBruto);
				double descuentoPorProducto = obtenerDescuentoPorTipoProducto(tipoProducto,importeBruto);
				double penalizacion =  obtenerPenalizacion(tipoProducto,importeBruto);
				double importeTotal = importeBruto - descuentoCantidad - descuentoPorProducto + penalizacion;
				
				Comprobante comprobante = new Comprobante(LocalDateTime.now(),
						                                  nombre, 
						                                  producto, 
						                                  litros, 
						                                  precioL, 
						                                  importeBruto, 
						                                  descuentoCantidad+descuentoPorProducto,
						                                  importeTotal
						                                  );
				
				repostajes.add(comprobante);
				
				clientes.get(nombre).add(comprobante);
				
				
			}else {
				System.out.println("La cantidad de litros debe ser mayor a 0");
			}
			
			obtenerEstadoDepositos();
			
			
			
			
			
		}else {
			System.out.println("Producto no válido");
		}
		
	}

	




	private static double obtenerPenalizacion(int tipoProducto, double importeBruto) {
		   double penalizacion= 0;
		  
		  if(tipoProducto==Constantes.ID_DIESEL) {
			  penalizacion = importeBruto*Constantes.PENALIZACION_DIESEL;
		  }
		  
		  return penalizacion;
	}




	private static double obtenerDescuentoPorTipoProducto(int tipoProducto, double importeBruto) {
		
		  double descuento= 0;
		  
		  if(tipoProducto==Constantes.ID_GAS) {
			  descuento = importeBruto*Constantes.DESCUENTO_GAS;
		  }
		  
		  return descuento;
		
	}




	private static double obtenerDescuentoPorCantidad(double importeBruto) {
		
	    double descuento = 0;
		
	    if(importeBruto>=Constantes.LIMITE_DESCUENTO) {
	    	descuento = importeBruto*Constantes.DESCUENTO_CANTIDAD;
	    }
		
		return descuento;
	}




	private static double obtenerPrecioLitroProducto(int tipoProducto) {
	
		double precioL=0;
		
		for(Deposito deposito: depositos) {
			if(deposito.getId()==tipoProducto) {
				precioL = deposito.getPrecio();
				
			}
		}
		return precioL;
		
	}




	private static void actualizarEstadoDeposito(int tipoProducto, double litros) {
		
		
		for(Deposito deposito: depositos) {
			if(deposito.getId()==tipoProducto) {
				if(deposito.obtenerCapacidadActual()>=litros) {
					deposito.setConsumo(deposito.getConsumo()+litros);
				}else {
					System.out.println("No hay litros suficientes del producto seleccionado");
				}
				
			}
		}
	}




	private static void mostrarMenuAdministrador() {
		
		System.out.println("----------ADMINISTRADOR ----------");
		System.out.println("1:Estadisticas");
		System.out.println("2:Informe");
		System.out.println("3:Pedido");
		System.out.println("4:Salir");
		
	}

	private static void mostrarMenuCliente() {
		
		System.out.println("----------CLIENTE ----------");
		System.out.println("1:Repostar");
		System.out.println("2:Ver comprobantes");
		System.out.println("3:Salir");
		
		
	}

	private static void leerDatosFichero() {
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(Constantes.FICHERO)));
			
			String linea = "";
			Usuario usuario = null;
			while((linea = br.readLine())!=null) {
				
				String[] datos = linea.split(Constantes.SEPARADOR);
				
				if(validarDatos(datos)) {
					usuario =  obtenerUsuario(datos);
					usuarios.add(usuario);
					
					anadirCliente(usuario);
				}
				System.out.println(linea);
			}
			
			br.close();
			recorrerLista();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

	private static void anadirCliente(Usuario usuario) {
		
		if(usuario.getPerfil().equals(Constantes.CLIENTE)) {
			clientes.put(usuario.getNombre(), new ArrayList<Comprobante>());
		}
		
	}

	private static void recorrerLista() {
		
		for(Usuario usuario: usuarios) {
			System.out.println(usuario);
		}
		
		
	}

	private static Usuario obtenerUsuario(String[] datos) {
		
		Usuario usuario = null;
	
		usuario = new Usuario(datos[0], datos[1], datos[2]);
		
		return usuario;
	}

	private static boolean validarDatos(String[] datos) {
		
		boolean datosValidos =  true;
		
		if(datos.length!=3) {
			datosValidos=false;
		}else {
			if(!datos[2].equals(Constantes.ADMIN) && 
			   !datos[2].equals(Constantes.CLIENTE)) {
				datosValidos=false;
			}
		}
		
		
		return datosValidos;
	}

}













