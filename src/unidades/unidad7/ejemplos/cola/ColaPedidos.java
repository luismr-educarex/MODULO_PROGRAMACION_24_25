package unidades.unidad7.ejemplos.cola;

public class ColaPedidos {
	
	static final int TAM_COLA = 10;
	static final int CABEZA = 0;
	static Pedido[] cola = new Pedido[TAM_COLA];
	static int siguienteLibre=CABEZA;
	
	
	public static boolean esVacia() {
		
		boolean esVacia=false;
	
		if(siguienteLibre==CABEZA) {
			esVacia=true;
		}
		
		return esVacia;
	}
	
    public static boolean estaLlena() {
		
		boolean estaLlena=false;
	
		if(siguienteLibre==TAM_COLA) {
			estaLlena=true;
		}
		
		return estaLlena;
	}
	
	
	public static void encolar(Pedido pedido) {
		
		if(!estaLlena()) {
			cola[siguienteLibre]=pedido;
			siguienteLibre++;
		}
		
	}
	
	public static Pedido desencola() {
		
	   Pedido pedidoCabeza=null;
		
		if(!esVacia()) {
			pedidoCabeza=cola[CABEZA];
			//tener que actualizar las posiones
			for(int i=1;i<siguienteLibre;i++) {
				cola[i-1] = cola[i];
			}
			cola[siguienteLibre-1]=null;
			siguienteLibre--;
		}
		
		return pedidoCabeza;
	}
	
	
	public static Pedido cabeza() {
		
		Pedido pedidoCabeza=null;
		
		if(!esVacia()) {
			pedidoCabeza=cola[CABEZA];
		}
		
		return pedidoCabeza;
	}
	
	public static void mostrarCola() {
		
		for(int i=0;i<TAM_COLA;i++) {
			if(cola[i]!=null) {
				System.out.println(cola[i]);
			}
		}
		System.out.println("_____________________________");
	}
	

}











