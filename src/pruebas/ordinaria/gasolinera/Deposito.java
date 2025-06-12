package pruebas.ordinaria.gasolinera;

public class Deposito {
	
	private String producto;
	private double capacidad;
	private double consumo;
	
	
	
	
    public String getProducto() {
		return producto;
	}




	public void setProducto(String producto) {
		this.producto = producto;
	}




	public double getCapacidad() {
		return capacidad;
	}




	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}




	public double getConsumo() {
		return consumo;
	}




	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}




	public Deposito(String producto, double capacidad, double consumo) {
		super();
		this.producto = producto;
		this.capacidad = capacidad;
		this.consumo = consumo;
	}




	public double obtenerCapacidadActual() {
    	
    	return capacidad-consumo;
    }

}
