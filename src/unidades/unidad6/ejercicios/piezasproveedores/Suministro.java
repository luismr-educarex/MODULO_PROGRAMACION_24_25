package unidades.unidad6.ejercicios.piezasproveedores;

public class Suministro {
	
	private int pieza;
	private int proveedor;
	private int cantidad;
	private double precio;
	
	public Suministro(int pieza, int proveedor, int cantidad, double precio) {
		super();
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getPieza() {
		return pieza;
	}

	public void setPieza(int pieza) {
		this.pieza = pieza;
	}

	public int getProveedor() {
		return proveedor;
	}

	public void setProveedor(int proveedor) {
		this.proveedor = proveedor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministro [pieza=" + pieza + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
	

}
