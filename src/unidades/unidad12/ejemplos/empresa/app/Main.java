package unidades.unidad12.ejemplos.empresa.app;

import java.util.List;
import java.util.Scanner;

import unidades.unidad12.ejemplos.empresa.modelos.Empleado;
import unidades.unidad12.ejemplos.empresa.services.EmpleadoService;

/**
 * Clase principal que se encarga de mostrar el menú y recoger las opciones elegidas por el usuario.
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final EmpleadoService service = new EmpleadoService();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpia buffer

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
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
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

    private static void insertar() throws Exception {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Puesto: ");
        String puesto = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        service.insertarEmpleado(new Empleado(nombre, puesto, salario));
        System.out.println("Empleado insertado.");
    }

    private static void listar() throws Exception {
        List<Empleado> lista = service.listarEmpleados();
        if (lista.isEmpty()) {
            System.out.println("No hay empleados.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private static void actualizar() throws Exception {
        listar();
        System.out.print("ID del empleado a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo puesto: ");
        String puesto = sc.nextLine();
        System.out.print("Nuevo salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        service.actualizarEmpleado(new Empleado(id, nombre, puesto, salario));
        System.out.println("Empleado actualizado.");
    }

    private static void eliminar() throws Exception {
        listar();
        System.out.print("ID del empleado a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();
        service.eliminarEmpleado(id);
        System.out.println("Empleado eliminado.");
    }
}
