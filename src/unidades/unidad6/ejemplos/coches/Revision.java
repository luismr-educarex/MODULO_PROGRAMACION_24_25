package unidades.unidad6.ejemplos.coches;

public class Revision {
	
	private int id;
	private int mes;
	private int anio;
	private String elementoRevisado;
	private char estadoElemento;
	private double costeRevision;
	
	
	public Revision(int id, int mes, int anio, String elementoRevisado, char estadoElemento, double costeRevision) {

		this.id = id;
		this.mes = mes;
		this.anio = anio;
		this.elementoRevisado = elementoRevisado;
		this.estadoElemento = estadoElemento;
		this.costeRevision = costeRevision;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getElementoRevisado() {
		return elementoRevisado;
	}


	public void setElementoRevisado(String elementoRevisado) {
		this.elementoRevisado = elementoRevisado;
	}


	public char getEstadoElemento() {
		return estadoElemento;
	}


	public void setEstadoElemento(char estadoElemento) {
		this.estadoElemento = estadoElemento;
	}


	public double getCosteRevision() {
		return costeRevision;
	}


	public void setCosteRevision(double costeRevision) {
		this.costeRevision = costeRevision;
	}


	@Override
	public String toString() {
		return "Revision [id=" + id + ", mes=" + mes + ", anio=" + anio + ", elementoRevisado=" + elementoRevisado
				+ ", estadoElemento=" + estadoElemento + ", costeRevision=" + costeRevision + "]";
	}


	
	
	
	
	
	
	

	
	

}
