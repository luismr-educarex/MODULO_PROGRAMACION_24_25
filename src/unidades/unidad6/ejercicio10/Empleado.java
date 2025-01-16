package unidades.unidad6.ejercicio10;

import java.util.Objects;

public class Empleado {
	
	private int id;
	private String nombre;
	private String apellidos;
	private double horas;
	private String cargo;
	private double pago_por_horas;
	private String modalidad;
	private double bonificacion;
	private static int contador=0;
	
	
	public Empleado(String nombre, String apellidos, double horas, String cargo, double pago_por_horas,
			String modalidad, double bonificacion) {
	
		contador++;
		this.id = contador;
		
		//Datos.contEmpleados++;
		//this.id= Datos.contEmpleados;
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.horas = horas;
		this.cargo = cargo;
		this.pago_por_horas = pago_por_horas;
		this.modalidad = modalidad;
		this.bonificacion = bonificacion;
	}

	public int getContador() {
		return contador;
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


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		this.horas = horas;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getPago_por_horas() {
		return pago_por_horas;
	}


	public void setPago_por_horas(double pago_por_horas) {
		this.pago_por_horas = pago_por_horas;
	}


	public String getModalidad() {
		return modalidad;
	}


	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}


	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	@Override
	public String toString() {
		return "Empleado [id=" + id + ",nombre=" + nombre + ", apellidos=" + apellidos + "\n, horas=" + horas + ", cargo=" + cargo
				+ ", pago_por_horas=" + pago_por_horas + ",\n modalidad=" + modalidad + ", bonificacion=" + bonificacion
				+ "]\n\n";
	}
	
	
	public boolean sonIguales(Empleado empleado) {
		
		boolean sonIguales = false;
		if(nombre.equals(empleado.getNombre())
		   && apellidos.equals(empleado.getApellidos())
		   && cargo.equals(empleado.getCargo())
				) {
			sonIguales=true;
		}
		
		return sonIguales;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, cargo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(cargo, other.cargo)
				&& Objects.equals(nombre, other.nombre);
	}

	


	
	
	
	
	
	
	
	
	
	
	

}
