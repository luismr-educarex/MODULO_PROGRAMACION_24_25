package unidades.unidad7.ejemplos.enumerados;

public class MainJuegoCartas {

	public static void main(String[] args) {
		
		JuegoCartas carta1 = new JuegoCartas(JuegoCartas.PALO_PICAS, 2);
		JuegoCartas carta2 = new JuegoCartas(44, 3);
		
		System.out.println("La carta 1 es:"+carta1.getPuntos()+
		" de "+carta1.getNombrePalo());
		
		System.out.println("La carta 2 es:"+carta2.getPuntos()+
				" de "+carta2.getNombrePalo());
		

	}

}
