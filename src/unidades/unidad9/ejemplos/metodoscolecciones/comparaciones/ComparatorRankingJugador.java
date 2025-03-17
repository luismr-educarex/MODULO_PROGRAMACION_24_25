package unidades.unidad9.ejemplos.metodoscolecciones.comparaciones;

import java.util.Comparator;

public class ComparatorRankingJugador implements Comparator<Jugador> {

	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {
		
		return Integer.compare(jugador1.getRanking(),jugador2.getRanking());
	}

}
