package unidades.unidad9.ejemplos.listaPersonas;

public class Nodo {
	
	private Persona persona;
	private Nodo siguiente;
	
	
	public Nodo(Persona persona, Nodo siguiente) {
		super();
		this.persona = persona;
		this.siguiente = siguiente;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	

}
