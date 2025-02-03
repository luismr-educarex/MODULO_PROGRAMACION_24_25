package unidades.unidad7.ejemplos.enumerados;

public enum Puntos {

	
	UNO(1),
	DOS(2),
	TRES(3), 
	// ....
	DIEZ(10); // CUIDADO CON EL ;
	
	private final int puntos;
	
	private Puntos(int puntos) {
		this.puntos=puntos;
	}

	public int getPuntos() {
		return puntos;
	}
	
}
