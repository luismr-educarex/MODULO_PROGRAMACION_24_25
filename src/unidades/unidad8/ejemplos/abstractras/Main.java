package unidades.unidad8.ejemplos.abstractras;

public class Main {

	public static void main(String[] args) {
	
		
		Bicicleta bici = new Bicicleta("pedaleo", 2, 10, 63);
		Autobus bus = new Autobus("Diesel",6, 80, 30, 50);
		
	
		System.out.println("Velocidad bici:"+bici.calcularVelocidad()+"Km/h");
		bici.sonidoClaxon();
		System.out.println("Velocidad bus:"+bus.calcularVelocidad()+"Km/h");
		bus.sonidoClaxon();
	}

}
