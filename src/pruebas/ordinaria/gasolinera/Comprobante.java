package pruebas.ordinaria.gasolinera;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comprobante {
	
	private LocalDateTime fechaHora;
	private String nombreCliente;
	private String tipoProducto;
	private double litros;
	private double precioL;
	private double importeBruto;
	private double descuentos;
	private double importeFinal;
	public Comprobante(LocalDateTime fechaHora, String nombreCliente, String tipoProducto, double litros,
			double precioL, double importeBruto, double descuentos, double importeFinal) {
		super();
		this.fechaHora = fechaHora;
		this.nombreCliente = nombreCliente;
		this.tipoProducto = tipoProducto;
		this.litros = litros;
		this.precioL = precioL;
		this.importeBruto = importeBruto;
		this.descuentos = descuentos;
		this.importeFinal = importeFinal;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getPrecioL() {
		return precioL;
	}
	public void setPrecioL(double precioL) {
		this.precioL = precioL;
	}
	public double getImporteBruto() {
		return importeBruto;
	}
	public void setImporteBruto(double importeBruto) {
		this.importeBruto = importeBruto;
	}
	public double getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(double descuentos) {
		this.descuentos = descuentos;
	}
	public double getImporteFinal() {
		return importeFinal;
	}
	public void setImporteFinal(double importeFinal) {
		this.importeFinal = importeFinal;
	}
	@Override
	public String toString() {
		return "Comprobante [fechaHora=" + fechaHora + ", nombreCliente=" + nombreCliente + ", tipoProducto="
				+ tipoProducto + ", litros=" + litros + ", precioL=" + precioL + ", importeBruto=" + importeBruto
				+ ", descuentos=" + descuentos + ", importeFinal=" + importeFinal + "]";
	}
	
	

}
