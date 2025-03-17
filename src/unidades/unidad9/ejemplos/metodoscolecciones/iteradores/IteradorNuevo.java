package unidades.unidad9.ejemplos.metodoscolecciones.iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorNuevo {

	public static void main(String[] args) {
		
		ArrayList<String> marcas = new ArrayList<String>();
		
		marcas.add("BWM");
		marcas.add("Audi");
		marcas.add("Nissan");
		marcas.add("Volvo");
		marcas.add("Porche");
		marcas.add("Tesla");
		
		System.out.println("Contenido original de la lista");
		Iterator<String> it = marcas.iterator();
		while(it.hasNext()) {
			String elemento = it.next();
			System.out.println(elemento);
		}
		
	}

	
	
	
	
	
}
