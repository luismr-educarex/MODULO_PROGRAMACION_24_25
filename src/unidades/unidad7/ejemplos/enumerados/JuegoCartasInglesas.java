package unidades.unidad7.ejemplos.enumerados;

public class JuegoCartasInglesas {

	public static void main(String[] args) {
		
		Carta carta1 = new Carta(Palo.PALO_DIAMANTES, 6);
		
		System.out.println("La carta 1 es:"+carta1.getPuntos()+
				" de "+carta1.getNombrePalo());

	}

}
