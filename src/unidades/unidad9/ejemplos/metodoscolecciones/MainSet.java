package unidades.unidad9.ejemplos.metodoscolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		//Crear listas vacías
		Set<String> conjuntoMarcasAs = new HashSet<String>();
		Set<String> conjuntoMarcaEu = new HashSet<String>();
		
		//Añadir un elemento a la lista (coleccion)
		conjuntoMarcasAs.add("Toyota");
		conjuntoMarcasAs.add("Mazda");
		conjuntoMarcasAs.add("Honda");
		
		System.out.println(conjuntoMarcasAs);
		
		conjuntoMarcaEu.add("Mercedes");
		conjuntoMarcaEu.add("Renault");
		conjuntoMarcaEu.add("Seat");
		
		System.out.println(conjuntoMarcaEu);
		
		for(String marca:conjuntoMarcasAs) {
			System.out.println(marca);
		}
		
		Set<String> conjuntoMarcas= new HashSet<String>(conjuntoMarcasAs);
		conjuntoMarcas.addAll(conjuntoMarcaEu);
		System.out.println(conjuntoMarcas);
		System.out.println("Tamaño lista marcas:"+conjuntoMarcas.size());

		conjuntoMarcas.remove("Toyota");
		System.out.println(conjuntoMarcas);
		
		//listaMarca.removeAll(listaMarcaEu);
		//System.out.println(listaMarca);
		
		conjuntoMarcas.retainAll(conjuntoMarcaEu);
		System.out.println(conjuntoMarcas);
		
		if(!conjuntoMarcas.isEmpty()) {
			System.out.println("Tamaño lista marcas:"+conjuntoMarcas.size());
		}
		
		conjuntoMarcas.add("Mercedes");
		
		System.out.println(conjuntoMarcas);
		
	
		

	}

}
