package unidades.unidad9.ejemplos.lista;

public class Lista implements ILista{
	
	private int numElementos=0;
	private Nodo inicio=null;
	private Nodo actual=null;

	@Override
	public void add(Object object) {
	
		Nodo nuevo = new Nodo(object, null);
		if(inicio==null) {
			inicio=nuevo;
		}else {
			actual.setSiguiente(nuevo);
		}
		actual=nuevo;
		numElementos++;
		
	}

	@Override
	public void delete(Object object) {
		
		numElementos--;
		
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		
		if(!isEmpty()) {
			Nodo nodo = inicio;
			while(nodo!=null) {
				System.out.println(nodo);
				nodo = nodo.getSiguiente();
			}
			
		}else {
			System.out.println("Lista vacía");
		}
		
	}

	@Override
	public boolean isEmpty() {
		
		boolean esVacia=true;
		if(inicio!=null) {
			esVacia=false;
		}
		
		return esVacia;
	}

	@Override
	public int size() {
		
		
		return numElementos;
	}

	
	@Override
	public boolean search(Object object) {
		
		boolean personaEncontrada = false;
		if(!isEmpty()) {
			Nodo nodo = inicio;
			while(nodo!=null && !personaEncontrada) {
				
				nodo = nodo.getSiguiente();
			}
		}
		
		return personaEncontrada;
	}

}











