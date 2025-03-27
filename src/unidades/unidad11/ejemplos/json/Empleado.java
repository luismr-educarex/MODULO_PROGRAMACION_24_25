package unidades.unidad11.ejemplos.json;

import java.util.Arrays;

public class Empleado {

	private String nombre;
	private int edad;
	private String ciudad;
	private String[] conocimientos;
	
	
	public Empleado(String nombre, int edad, String ciudad, String[] conocimientos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.conocimientos = conocimientos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String[] getConocimientos() {
		return conocimientos;
	}
	public void setConocimientos(String[] conocimientos) {
		this.conocimientos = conocimientos;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", conocimientos="
				+ Arrays.toString(conocimientos) + "]";
	}
	
	
}
