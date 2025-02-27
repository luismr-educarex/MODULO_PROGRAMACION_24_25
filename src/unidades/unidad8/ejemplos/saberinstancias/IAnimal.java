package unidades.unidad8.ejemplos.saberinstancias;

public interface IAnimal {
	
	public static final String ZONA = "Extremadura";

	void hacerSonido();
	void dormir();
	
	default void morir() {
		System.out.println("Nos vamos de entierro");
	}
}
