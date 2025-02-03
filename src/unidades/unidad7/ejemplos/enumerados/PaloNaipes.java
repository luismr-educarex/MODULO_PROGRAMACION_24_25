package unidades.unidad7.ejemplos.enumerados;

public enum PaloNaipes {
	
	PICAS("Picas"),
	CORAZONES("Corazones"),
	TREBOLES("Treboles"),
	DIAMANTES("Diamantes"); // CUIDADO CON EL ;
	
	private final String nombre;
	
	private PaloNaipes(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	

}
