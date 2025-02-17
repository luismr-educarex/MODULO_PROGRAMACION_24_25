package unidades.unidad7.ejemplos.cola;

public class ColaPedidos {
	
	static final int TAM_COLA = 10;
	static Pedido[] cola = new Pedido[TAM_COLA];
	static int cabeza =0;
	static int siguienteLibre=cabeza;
	
	
	public static boolean esVacia() {
		
		boolean esVacia=false;
	
		if(siguienteLibre==cabeza) {
			esVacia=true;
		}
		
		return esVacia;
	}
	
	
	public static void encolar(Pedido pedido) {
		
		if(siguienteLibre<TAM_COLA) {
			cola[siguienteLibre]=pedido;
			siguienteLibre++;
		}
		
	}
	
	public static Pedido desencola() {
		
	   Pedido pedidoCabeza=null;
		
		if(!esVacia()) {
			pedidoCabeza=cola[cabeza];
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
			pedidoCabeza=cola[cabeza];
		}
		
		return pedidoCabeza;
	}
	

}











