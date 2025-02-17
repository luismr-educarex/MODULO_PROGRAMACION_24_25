package unidades.unidad7.ejemplos.cola;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(0, null);
		Pedido pedido2 = new Pedido(0, null);

		ColaPedidos.encolar(pedido1);
		ColaPedidos.encolar(pedido2);
		
		Pedido primerPedido = ColaPedidos.cabeza();
		
		primerPedido = ColaPedidos.desencola();
		
		primerPedido = ColaPedidos.cabeza();
		
	}

}
