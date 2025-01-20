package unidades.unidad6.ejercicios.controlVendimia;

import java.util.Arrays;

public class Zona {
	
	private int id;
	private double[] recolecciones;

	public Zona(int id, double[] recolecciones) {
		super();
		this.id = id;
		this.recolecciones = recolecciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double[] getRecolecciones() {
		return recolecciones;
	}

	public void setRecolecciones(double[] recolecciones) {
		this.recolecciones = recolecciones;
	}

	@Override
	public String toString() {
		return "Zona [id=" + id + ", recolecciones=" + Arrays.toString(recolecciones) + "]";
	}
	
	public void insertarCantidadRecoleccion(double cantidad) {
		
		if(cantidad>0) {
			recolecciones[obtenerNumRecolecciones()]=cantidad;
		}
		
		
	}
	
	public int obtenerNumRecolecciones() {
		
		int numeroRecolecciones=0;
		boolean encontrado=false;
		
		for(int i=0;!encontrado && i<recolecciones.length;i++) {
			if(recolecciones[i]==0) {
				numeroRecolecciones=i;
				encontrado=true;
			}
		}
		
		return numeroRecolecciones;
		
	}

	public double obtenerTotal() {
		
		
		double cantidad=0;
		int numeroRecolecciones = obtenerNumRecolecciones();
		
		for(int i=0;i<numeroRecolecciones;i++) {
				cantidad+=recolecciones[i];
		}
		
		return cantidad;
	}
	
	
	
	

}
