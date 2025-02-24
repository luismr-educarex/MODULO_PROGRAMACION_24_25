package unidades.unidad8.ejemplos.interfaz.animales;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(ISonido.nombre);
		
		Gato gato = new Gato();
		Perro perro = new Perro();
		Leon leon = new Leon();
		Coche coche = new Coche();
		
		gato.voz();
		perro.voz();
		leon.voz();
		coche.voz();
		
		gato.vozDurmiendo();
		perro.vozDurmiendo();
		leon.vozDurmiendo();
		
	}
	
	

}
