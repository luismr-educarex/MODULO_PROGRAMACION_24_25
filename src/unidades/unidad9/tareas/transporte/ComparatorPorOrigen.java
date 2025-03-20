package unidades.unidad9.tareas.transporte;

import java.util.Comparator;

public class ComparatorPorOrigen implements Comparator<Viaje>{

	@Override
	public int compare(Viaje viaje1, Viaje viaje2) {
		
		return viaje1.getOrigen().compareToIgnoreCase(viaje2.getOrigen());
	}

}
