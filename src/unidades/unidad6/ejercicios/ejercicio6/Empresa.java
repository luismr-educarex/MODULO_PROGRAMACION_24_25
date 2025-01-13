package unidades.unidad6.ejercicios.ejercicio6;

public class Empresa {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Susana Pérez", 2344, "Contabilidad", "Vicedirectora");
		Empleado empleado2 = new Empleado("Juan José Ramirez", 3444, "IT", "Programador");
		Empleado empleado3 = new Empleado("Ana María García", 2311, "Fabricación", "Ingeniera");

		System.out.println("Nombre:"+empleado1.getNombre());
		
		empleado1.setNombre("Susana Griso");
		
		System.out.println("Nombre:"+empleado1.getNombre());
		
		Empleado empleado4 = new Empleado("Antonio Rodriguez", 2389);
		
		Empleado empleado5 = new Empleado();
		
		System.out.println("Departamento:"+empleado4.getDepartamento());
		
		System.out.println("Nombre:"+empleado5.getNombre());
		
		empleado4.setDepartamento("Ventas");
		empleado5.setNombre("Margarita Torres");
		
		System.out.println("Departamento:"+empleado4.getDepartamento());
		
		System.out.println("Nombre:"+empleado5.getNombre());

	}

}
