package pruebas.ordinaria.gasolinera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>(); 
	private static Map<String,List<Comprobante>> clientes= new HashMap<String,List<Comprobante>>();
	private static List<Comprobante> respostajes = new ArrayList<Comprobante>();
	private static final Scanner entrada = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	
		
		 leerDatosFichero();
		 login();
		 

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
				  verComprobantes();
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

	private static void verComprobantes() {
		// TODO Auto-generated method stub
		
	}

	private static void repostar(String nombre) {
		
		System.out.println("--Hola "+nombre+" ¿Qué producto desea?--");
		System.out.println("1.Diesel");
		System.out.println("2.Gasolina");
		System.out.println("3.Gas");
		
		int tipoProducto = entrada.nextInt();
		double litros;
		if(tipoProducto>=1 && tipoProducto<=3) {
			
			System.out.println("Litros:");
			litros = entrada.nextDouble();
			
			
			
			
			Comprobante comprobante = new Comprobante(null, nombre, nombre, litros, litros, litros, tipoProducto, litros);
			
			
			
			
		}else {
			System.out.println("Producto no válido");
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













