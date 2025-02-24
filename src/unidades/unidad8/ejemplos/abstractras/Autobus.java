package unidades.unidad8.ejemplos.abstractras;

public class Autobus extends Vehiculo {

	private int numPasajeros;
	private int capacidad;
	
	

	public Autobus(String fuenteAlimentacion, int ruedas, double velocidad, int numPasajeros, int capacidad) {
		super(fuenteAlimentacion, ruedas, velocidad);
		this.numPasajeros = numPasajeros;
		this.capacidad = capacidad;
	}



	@Override
	public double calcularVelocidad() {
		
		double velocidad = this.velocidad;
		
		int diferenciaCapacidadPas=capacidad-numPasajeros;
		
		if(diferenciaCapacidadPas==0) {
			velocidad-=10;
		}else if(diferenciaCapacidadPas<(capacidad/2)){
			velocidad-=5;	
		}else {
			velocidad-=1;
		}
			
		return velocidad;
	}



	@Override
	public String toString() {
		return "Autobus [numPasajeros=" + numPasajeros + ", capacidad=" + capacidad + "]";
	}
	
	

}







