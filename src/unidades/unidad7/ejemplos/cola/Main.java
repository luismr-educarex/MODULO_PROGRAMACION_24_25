package unidades.unidad7.ejemplos.cola;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1,"Alimentos",5,"Urgente");
		Pedido pedido2 = new Pedido(2,"Ropa",1,"Normal");
		Pedido pedido3 = new Pedido(3,"Electrónica",0.5,"Normal");
		
		

		ColaPedidos.encolar(pedido1);
		ColaPedidos.encolar(pedido2);
		ColaPedidos.encolar(pedido3);
		
		ColaPedidos.mostrarCola();
		
		Pedido primerPedido = ColaPedidos.cabeza();
		
		ColaPedidos.mostrarCola();
		
		primerPedido = ColaPedidos.desencola();
		
		ColaPedidos.mostrarCola();
		
		primerPedido = ColaPedidos.cabeza();
		
	}

}
