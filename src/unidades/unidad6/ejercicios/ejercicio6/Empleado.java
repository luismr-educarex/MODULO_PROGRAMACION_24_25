package unidades.unidad6.ejercicios.ejercicio6;

public class Empleado {

	private String nombre;
	private int id;
	private String departamento;
	private String puesto;
	private static String empresa;
	
	public Empleado(String nombre, int id, String departamento, String puesto) {
	
		this.nombre = nombre;
		this.id = id;
		this.departamento = departamento;
		this.puesto = puesto;
	}
	
	public Empleado(String nombre, int id) {
		
		this.nombre = nombre;
		this.id = id;
		this.departamento = "";
		this.puesto = "";
	}
	

   public Empleado() {
		
		this.nombre = "";
		this.id = 0;
		this.departamento = "";
		this.puesto = "";
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
   
	
	
	
	
	
}
