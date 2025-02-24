package unidades.unidad8.ejemplos.abstractras;

public abstract class Vehiculo {
	
	protected String fuenteAlimentacion;
	protected int ruedas;
	protected double velocidad;
	
	
	public Vehiculo(String fuenteAlimentacion, int ruedas, double velocidad) {
		super();
		this.fuenteAlimentacion = fuenteAlimentacion;
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	
	public abstract double calcularVelocidad();
		
	
	
	public void sonidoClaxon() {
		System.out.println("piiiiiiiiiiiiii");
	}


	public String getFuenteAlimentacion() {
		return fuenteAlimentacion;
	}


	public void setFuenteAlimentacion(String fuenteAlimentacion) {
		this.fuenteAlimentacion = fuenteAlimentacion;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Vehiculo [fuenteAlimentacion=" + fuenteAlimentacion + ", ruedas=" + ruedas + ", velocidad=" + velocidad
				+ "]";
	}
	
	
	
	
	
	

}
