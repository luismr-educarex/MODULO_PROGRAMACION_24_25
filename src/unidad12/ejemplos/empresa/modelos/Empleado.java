package unidad12.ejemplos.empresa.modelos;

public class Empleado {
	
	private int id;
	private String nombre;
	private String puesto;
	private double salario;
	
	public Empleado(String nombre, String puesto, double salario) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}

	public Empleado(int id, String nombre, String puesto, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
	

}
