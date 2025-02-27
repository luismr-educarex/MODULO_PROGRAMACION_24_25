package unidades.unidad9.ejemplos;

import java.time.LocalDate;

public class Persona {

	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	
	
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
