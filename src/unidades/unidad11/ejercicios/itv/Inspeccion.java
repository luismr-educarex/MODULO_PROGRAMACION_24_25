package unidades.unidad11.ejercicios.itv;

import java.util.ArrayList;
import java.util.List;

public class Inspeccion {
	
	private int id;
	private List<LineaInspeccion> lineasInspeccion;
	
	
	public Inspeccion(int id, List<LineaInspeccion> lineasInspeccion) {
		super();
		this.id = id;
		this.lineasInspeccion = lineasInspeccion;
	}
	
	public Inspeccion(int id) {
		super();
		this.id = id;
		this.lineasInspeccion = new ArrayList<LineaInspeccion>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<LineaInspeccion> getLineasInspeccion() {
		return lineasInspeccion;
	}


	public void setLineasInspeccion(List<LineaInspeccion> lineasInspeccion) {
		this.lineasInspeccion = lineasInspeccion;
	}


	@Override
	public String toString() {
		return "Inspeccion [id=" + id + ", lineasInspeccion=" + lineasInspeccion + "]";
	}
	
	
	
	

}
