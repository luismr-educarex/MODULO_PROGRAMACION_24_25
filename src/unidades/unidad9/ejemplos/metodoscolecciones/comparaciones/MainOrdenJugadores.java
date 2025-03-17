package unidades.unidad9.ejemplos.metodoscolecciones.comparaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenJugadores {

	public static void main(String[] args) {
		
		List<Jugador> equipo = new ArrayList<Jugador>();
		
		Jugador jugador1 = new Jugador(59, "Tobías", 20);
		Jugador jugador2 = new Jugador(69, "Antonio", 22);
		Jugador jugador3 = new Jugador(43, "Marta", 24);
		
		equipo.add(jugador1);
		equipo.add(jugador2);
		equipo.add(jugador3);
		
		
		System.out.println(equipo);
		Collections.sort(equipo);
		System.out.println(equipo);

	}

}




