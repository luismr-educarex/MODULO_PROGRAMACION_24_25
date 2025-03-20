package unidades.unidad9.tareas.transporte;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Viaje> listaViajes = new ArrayList<Viaje>();
		
		listaViajes.add(new TransporteMercancia("1234FFF",
				                                "Juán Pérez",
				                                "Madrid",
				                                "Bilbao",10.5,"General"));
		listaViajes.add(new TransportePeligroso("2223YDN",
								                "Ana López",
								                "Sevilla",
								                "Valencia",4,"Químicos"));
		listaViajes.add(new TransporteAnimales("9876HHH",
								                "Carlos García",
								                "Málaga",
								                "Salamanca",20,"Bovino"));
		
		for(Viaje viaje: listaViajes) {
			viaje.mostrarDetalle();
		}
	}

	
	
	
	
	
	
	
	
	

}
