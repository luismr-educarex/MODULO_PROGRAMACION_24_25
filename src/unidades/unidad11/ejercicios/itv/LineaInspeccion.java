package unidades.unidad11.ejercicios.itv;

public class LineaInspeccion {

	
	private String nombre;
	private Resultado resultado;
	private String observaciones;
	
	
	public LineaInspeccion(String nombre, Resultado resultado, String observaciones) {
		super();
		this.nombre = nombre;
		this.resultado = resultado;
		this.observaciones = observaciones;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Resultado getResultado() {
		return resultado;
	}


	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	@Override
	public String toString() {
		return "LineaInspeccion [nombre=" + nombre + ", resultado=" + resultado + ", observaciones=" + observaciones
				+ "]";
	}
	
	
	
	
	
}
