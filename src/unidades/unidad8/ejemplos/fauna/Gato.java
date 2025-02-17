package unidades.unidad8.ejemplos.fauna;

public class Gato extends Mamifero {

	private String colorPelaje;
	
	
	public Gato(String nombre, int edad, int numPatas,String colorPelaje) {
		super(nombre, edad, numPatas);
		this.colorPelaje=colorPelaje;
		
	}
	
	public void comer() {
		super.comer();
		System.out.println("mmimimmimimimimimi");
	}

}
