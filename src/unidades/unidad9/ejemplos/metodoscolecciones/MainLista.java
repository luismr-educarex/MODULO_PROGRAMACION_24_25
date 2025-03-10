package unidades.unidad9.ejemplos.metodoscolecciones;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainLista {

	public static void main(String[] args) {
		
		//Crear listas vacías
		List<String> listaMarcaAs = new ArrayList<String>();
		List<String> listaMarcaEu = new ArrayList<String>();
		
		//Añadir un elemento a la lista (coleccion)
		listaMarcaAs.add("Toyota");
		listaMarcaAs.add("Mazda");
		listaMarcaAs.add("Honda");
		
		System.out.println(listaMarcaAs);
		
		listaMarcaEu.add("Mercedes");
		listaMarcaEu.add("Renault");
		listaMarcaEu.add("Seat");
		
		System.out.println(listaMarcaEu);
		
		for(String marca:listaMarcaAs) {
			System.out.println(marca);
		}
		
		List<String> listaMarca= new ArrayList<String>(listaMarcaAs);
		listaMarca.addAll(listaMarcaEu);
		System.out.println(listaMarca);
		System.out.println("Tamaño lista marcas:"+listaMarca.size());

		listaMarca.remove("Toyota");
		System.out.println(listaMarca);
		
		//listaMarca.removeAll(listaMarcaEu);
		//System.out.println(listaMarca);
		
		listaMarca.retainAll(listaMarcaEu);
		System.out.println(listaMarca);
		
		if(!listaMarca.isEmpty()) {
			System.out.println("Tamaño lista marcas:"+listaMarca.size());
		}
		
		if(listaMarca.contains("Mercedes")) {
			System.out.println("Contiene a Mercedes");
		}
		
		if(listaMarca.containsAll(listaMarcaAs)) {
			System.out.println("Contiene las marcas asiáticas");
		}
	
		
		// -------------------Métodos de List----------------------
		
		listaMarca.add(1, "Ford");
		System.out.println(listaMarca);
		
		List<String> listaMarcasAm = new ArrayList<String>();
		listaMarcasAm.add("Chevrolet");
		listaMarcasAm.add("Tesla");
		listaMarcasAm.add("Jeep");
		
		listaMarca.addAll(2, listaMarcasAm);
		
		listaMarca.remove(3);
		System.out.println(listaMarca);
		
		System.out.println("Marca en la posición 3:"+listaMarca.get(3));
		
		List<String> listaMarcaFav = listaMarca.subList(1, 3);
		
		System.out.println("Favoritas:"+listaMarcaFav);
	
		listaMarca.add("Jeep");
		
		System.out.println(listaMarca);
	
	
	}

}
















