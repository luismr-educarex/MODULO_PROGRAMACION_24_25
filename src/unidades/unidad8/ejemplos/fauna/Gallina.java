package unidades.unidad8.ejemplos.fauna;

public class Gallina extends Ave {

	private boolean crueca;
	
	public Gallina(String nombre, int edad, boolean plumas,boolean crueca) {
		super(nombre, edad, plumas);
		this.crueca = crueca;
	}

	
	@Override
	public void comer() {
		
		super.comer();
		System.out.println("pipipipipipipipipi");
	}
}









