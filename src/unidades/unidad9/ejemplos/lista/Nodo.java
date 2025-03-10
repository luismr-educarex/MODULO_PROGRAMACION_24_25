package unidades.unidad9.ejemplos.lista;

public class Nodo {
	
	private Object object;
	private Nodo siguiente;
	
	
	public Nodo(Object object, Nodo siguiente) {
		super();
		this.object = object;
		this.siguiente = siguiente;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	


}
