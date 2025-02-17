package unidades.unidad8.ejemplos.fauna;

public class Animal {

	private String nombre;
	private int edad;
	
	
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public void domir() {
		System.out.println("Shhhhhhhh");
	}
	
	public void comer() {
		System.out.print("Está comiendo...");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
