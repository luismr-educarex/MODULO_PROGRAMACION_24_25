package unidades.unidad9.ejemplos.metodoscolecciones.comparaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenComparatorJugadores {

	public static void main(String[] args) {
		
		List<Jugador> equipo = new ArrayList<Jugador>();
		
		Jugador jugador1 = new Jugador(59, "Tobías", 20);
		Jugador jugador2 = new Jugador(69, "Antonio", 32);
		Jugador jugador3 = new Jugador(43, "Marta", 24);
		
		equipo.add(jugador1);
		equipo.add(jugador2);
		equipo.add(jugador3);
		
		System.out.println(equipo);
		//ORDENAMOS POR EDAD
		ComparatorEdadJugador comparadorEdad =  new ComparatorEdadJugador();
		Collections.sort(equipo, comparadorEdad);
		System.out.println(equipo);
		// ORDENAMOS POR RANKING
		ComparatorRankingJugador comparadorRanking = new ComparatorRankingJugador();
		Collections.sort(equipo, comparadorRanking);
		System.out.println(equipo);
		// ORDENAMOS POR NOMBRE
		ComparatorNombreJugador comparadorNombre= new ComparatorNombreJugador();
		Collections.sort(equipo, comparadorNombre);
		System.out.println(equipo);
	

	}

}




