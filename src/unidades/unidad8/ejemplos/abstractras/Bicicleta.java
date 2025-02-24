package unidades.unidad8.ejemplos.abstractras;

public class Bicicleta extends Vehiculo {

	private int numPedaleosMin;
	
	public Bicicleta(String fuenteAlimentacion, int ruedas, double velocidad,int pedaleo) {
		super(fuenteAlimentacion, ruedas, velocidad);

	}

	@Override
	public double calcularVelocidad() {
		
		double velocidad = this.velocidad;
		
		if(numPedaleosMin>60) {
			velocidad+=20;
		}else if(numPedaleosMin<60) {
			velocidad+=10;
		}else {
			velocidad+=15;
		}

		return velocidad;
	}

	@Override
	public String toString() {
		return "Bicicleta [numPedaleosMin=" + numPedaleosMin + "]";
	}

	
	
	

}
