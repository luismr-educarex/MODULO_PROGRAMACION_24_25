package unidades.unidad8.ejemplos.fauna;

public class Pez extends Animal{

	private String tipoAgua; //dulce o salada
	
	public Pez(String nombre, int edad,String tipoAgua) {
		super(nombre, edad);
		this.tipoAgua=tipoAgua;
	}

}
