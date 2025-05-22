package unidad12.ejemplos.empresa.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import unidad12.ejemplos.empresa.dao.EmpleadoDAO;
import unidad12.ejemplos.empresa.modelos.Empleado;

public class Main {
	
	private static final Scanner entrada = new Scanner(System.in);
	private static final EmpleadoDAO dao = new EmpleadoDAO();

	public static void main(String[] args) {
		
		int opcion;
		do {
			mostrarMenu();
			opcion=gestionarEmpleado();
		}while(opcion!=0);
		
		

	}

	private static int gestionarEmpleado() {
		
		int opcion;
		opcion = entrada.nextInt();
		
		try {
			switch(opcion) {
			 case 1:
				 insertar();
		     break;
			 case 2:
					listar();
		     break;
			 case 3:
				 actualizar();
		     break;
			 case 4:
				 eliminar();
		     break;
			 case 0:
				 System.out.println("Cerrando programa...");
		     break;
		     default:
		    	 System.out.println("Opción no válida");
				
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return opcion;
	}

	private static void salir() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminar() throws SQLException {
		
		//PEDIR LOS DATOS AL USUARIO
		dao.delete(1);
		System.out.println("Empleado eliminado");
		
	}

	private static void actualizar() throws SQLException {
		
		//PEDIR LOS DATOS AL USUARIO
		Empleado empleado = new Empleado(1,"Luis", "Diseñar gráfico", 50000);
		dao.actualizar(empleado);
		System.out.println("Empleado actualizado");
		
	}

	private static void listar() throws SQLException {
		
		System.out.println("Lista empleados");
		List<Empleado> lista = dao.listar();
		if(lista.isEmpty()) {
			System.out.println("NO hay empleados");
		}else {
			lista.forEach(System.out::println);
		}
		
	}

	private static void insertar() throws SQLException {
		
		
		//PEDIR LOS DATOS AL USUARIO
		Empleado empleado = new Empleado("Tomás", "Diseñar gráfico", 30000);
		dao.insertar(empleado);
		System.out.println("Empleado insertado");
		
	}

	private static void mostrarMenu() {
		
		System.out.println("-----------"
			     
				+ "\nGESTION EMPLEADOS"
				+ "\n1.Insertar empleado"
				+ "\n2.Listar empleados"
				+ "\n3.Actualizar empleado"
				+ "\n4.Eliminar empleado"
				+ "\n0.Salir"
				+ "\n-------------");
		
	}

}









