package pruebas.ordinaria.gasolinera;

public class Deposito {
	
	private int id;
	private String producto;
	private double capacidad;
	private double consumo;
	private double precio;
	

	
	
public static String obtenerNombreTipoProducto(int tipoProducto) {
		
		String nombreProducto;
		
		if(tipoProducto==Constantes.ID_DIESEL) {
			nombreProducto = Constantes.DIESEL;
		}else if(tipoProducto==Constantes.ID_GASOLINA) {
			nombreProducto = Constantes.GASOLINA;
		}else {
			nombreProducto = Constantes.GAS;
		}
			
		return nombreProducto;
	}
	
	
    public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




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




	public Deposito(int id,String producto, double capacidad, double consumo, double precio) {
		super();
		this.id=id;
		this.producto = producto;
		this.capacidad = capacidad;
		this.consumo = consumo;
		this.precio=precio;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public double obtenerCapacidadActual() {
    	
    	return capacidad-consumo;
    }

}
