package unidades.unidad9.tareas.transporte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppTransporte {
	
	public static final String SEPARADOR = ";";
	public static final String FORMATO_MATRICULA ="^\\d{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$";
	public static final int MATRICULA = 0;
	public static final int CONDUCTDOR = 1;
	public static final int ORIGEN = 2;
	public static final int DESTINO = 3;
	public static final int TIPO = 4;
	public static final int NUM_ANIMALES = 5;
	public static final int TIPO_ANIMAL = 6;
	public static final int PESO = 5;
	public static final int TIPO_MERCANCIA = 6;
	public static final int PELIGROSIDAD = 5;
	public static final int TIPO_MATERIAL = 6;
	public static final String TRANSPORTE_MERCANCIA = "Mercancia";
	public static final String TRANSPORTE_PELIGROSO = "Peligroso";
	public static final String TRANSPORTE_ANIMALES = "Animales";
	

	public static void main(String[] args) {
		
		Scanner entradaFichero = null;
		String [] datosLinea =  null;
		ArrayList<Viaje> listaViajes = new ArrayList<Viaje>();
		Map<String,List<Viaje>> viajeCamiones = new HashMap<String,List<Viaje>>();
		Set<String> destinos = new HashSet<String>();
		
		try {
			 entradaFichero = new Scanner(new File("viajes_transporte.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado fichero");
		}
		
		while(entradaFichero.hasNext()) {
			
			String linea = entradaFichero.nextLine();
			datosLinea = linea.split(SEPARADOR);
			try {
				validarDatos(datosLinea);
			} catch (TransporteException e) {
				System.out.println(e.getMessage());
			}
			Viaje viaje  = obtenerViaje(datosLinea);
			listaViajes.add(viaje);
			destinos.add(viaje.getDestino());
			
		}
		
		
		for(Viaje viaje:listaViajes) {
			viaje.mostrarDetalle();
		}
		
		
		
		for(Viaje viaje:listaViajes) {
			String matricula = viaje.getMatriculaCamion();
			//List<Viaje> listaViajeCamion = viajeCamiones.get(matricula);
			List<Viaje> listaViajeCamion = null;
			if(!viajeCamiones.containsKey(matricula)) { //es la primera vez que se va a insertar lista
				listaViajeCamion = new ArrayList<Viaje>();
				listaViajeCamion.add(viaje);
				viajeCamiones.put(matricula, listaViajeCamion);
			}else {
				viajeCamiones.get(matricula).add(viaje);
			}
			
		}
		
		System.out.println("Viajes por camión ###############");
		for(Map.Entry<String, List<Viaje>> viaje: viajeCamiones.entrySet()) {
			System.out.println("Camión:"+viaje.getKey()+",Viajes"+viaje.getValue());
		}
		
		
		System.out.println("Viajes por camión (ordenados por origen) ###############");
		ComparatorPorOrigen comparadorOrigen = new ComparatorPorOrigen();
		for(Map.Entry<String, List<Viaje>> viaje: viajeCamiones.entrySet()) {
			Collections.sort(viaje.getValue(),comparadorOrigen);
			System.out.println("Camión:"+viaje.getKey()+",Viajes"+viaje.getValue());
		}
		
		
		System.out.println( " ////////////// Destinos");
		Iterator<String> itDestinos = destinos.iterator();
		while(itDestinos.hasNext()) {
			System.out.println(itDestinos.next());
		}
		
			
	}

	private static Viaje obtenerViaje(String[] datosLinea) {
		
		Viaje viaje = null;
		
		
		if(TRANSPORTE_ANIMALES.equals(datosLinea[TIPO])) {
			viaje = new TransporteAnimales(datosLinea[MATRICULA],
										    datosLinea[CONDUCTDOR],
										    datosLinea[ORIGEN],
										    datosLinea[DESTINO],
										    Integer.parseInt(datosLinea[NUM_ANIMALES]),
										    datosLinea[TIPO_ANIMAL]);
		}else if(datosLinea[TIPO].equals(TRANSPORTE_PELIGROSO)) {
			viaje = new TransportePeligroso(datosLinea[MATRICULA],
				    datosLinea[CONDUCTDOR],
				    datosLinea[ORIGEN],
				    datosLinea[DESTINO],
				    Integer.parseInt(datosLinea[PELIGROSIDAD]),
				    datosLinea[TIPO_MATERIAL]);
			
		}else if(datosLinea[TIPO].equals(TRANSPORTE_MERCANCIA)) {
			viaje = new TransporteMercancia(datosLinea[MATRICULA],
				    datosLinea[CONDUCTDOR],
				    datosLinea[ORIGEN],
				    datosLinea[DESTINO],
				    Double.parseDouble(datosLinea[PESO]),
				    datosLinea[TIPO_MERCANCIA]);
			
		}else {
			System.out.println("Esta línea no pertenece a ningún tipo");
		}
		
		return viaje;
	}

	private static void validarDatos(String[] datosLinea) throws TransporteException {
		
		if(!validarMatricula(datosLinea[0])) {
			throw new TransporteException("Matrícula no válida:"+datosLinea[0]);
			
			
		}
	}

	private static boolean validarMatricula(String matricula) {
		
		return matricula.trim().matches(FORMATO_MATRICULA);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
