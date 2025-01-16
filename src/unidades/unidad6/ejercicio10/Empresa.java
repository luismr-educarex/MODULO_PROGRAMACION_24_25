package unidades.unidad6.ejercicio10;

public class Empresa {

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[Datos.NUM_EMPLEADOS];
		
		Empleado empleado1 = new Empleado("Antonio", 
										  "García Torres", 
										   40, "Jefe", Datos.PRECIO_HORA_JEFE, 
										   "Completo", Datos.BONIFICACION_T_COMPLETO);
		
		Empleado empleado2 = new Empleado("Amparo", 
										  "Martínez Ejido", 
										   42, "Gerente", Datos.PRECIO_HORA_GERENTE, 
										   "Completo", Datos.BONIFICACION_T_COMPLETO);
		
		Empleado empleado3 = new Empleado("Moises", 
										  "Carrasco López", 
										   35, "Operario", Datos.PRECIO_HORA_OPERARIO, 
										   "Completo", Datos.BONIFICACION_T_COMPLETO);
		
		Empleado empleado4 = new Empleado("Carmen", 
										  "Fernández Mazuecos", 
										   40, "Administrativo", Datos.PRECIO_HORA_ADMIN, 
										   "Completo", Datos.BONIFICACION_T_COMPLETO);
		
		Empleado empleado5 = new Empleado("Ana", 
										  "Flores Paredes", 
										   40, "Operario", Datos.PRECIO_HORA_OPERARIO, 
										   "Parcial", Datos.BONIFICACION_T_PARCIAL);

		
		Empleado empleado6 = new Empleado("Eduardo", 
				  "Flores Paredes", 
				   40, "Gerente", Datos.PRECIO_HORA_OPERARIO, 
				   "Competo", Datos.BONIFICACION_T_PARCIAL);

		
		System.out.println(empleado1);
	
		empleado1.setHoras(42);

		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		System.out.println(empleado6);
		
		
		
		
		
		
	}

}
