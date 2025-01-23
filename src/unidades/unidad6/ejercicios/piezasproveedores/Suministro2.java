package unidades.unidad6.ejercicios.piezasproveedores;

public class Suministro2{

	private Pieza pieza;
	private Proveedor proveedor;
	private int cantidad;
	private double precio;

	public Suministro2(Pieza pieza, Proveedor proveedor, int cantidad, double precio) {
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
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
		return "Suministro2 [pieza=" + pieza + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
	
}
