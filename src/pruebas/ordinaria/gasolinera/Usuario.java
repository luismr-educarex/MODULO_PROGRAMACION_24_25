package pruebas.ordinaria.gasolinera;

public class Usuario {
	
	private String nombre;
	private String pass;
	private String perfil;
	
	
	public Usuario(String nombre, String pass, String perfil) {
		super();
		this.nombre = nombre;
		this.pass = pass;
		this.perfil = perfil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", perfil=" + perfil + "]";
	}
	
	
	
	

}
