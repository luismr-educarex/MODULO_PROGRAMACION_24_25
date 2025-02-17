package unidades.unidad8.ejemplos.fauna;

public class Mamifero extends Animal{

	private int numPatas;
	
	
	public Mamifero(String nombre, int edad,int numPatas) {
		super(nombre, edad);
		this.numPatas = numPatas;
		
	}
	
	public void gestar() {
		System.out.println("Gestando...");
	}
	

}
