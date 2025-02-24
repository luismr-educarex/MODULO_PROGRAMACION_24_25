package unidades.unidad8.ejemplos.interfaz.animales;

public interface ISonido {
	
	static final String nombre = "SONIDOS";
	void voz();
	

	default void vozDurmiendo() {
		System.out.println("ZzzzZzzzzZzzzzz");
	}
	

}
