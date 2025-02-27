package unidades.unidad9.ejemplos;

public class Main {

	public static void main(String[] args) {
		
		ILista listaPersonas = new MiLista();
		
		Persona persona1 = new Persona(1, "Amparo");
		Persona persona2 = new Persona(12, "Tomás");
		Persona persona3 = new Persona(9, "Mbappé");
		Persona persona4 = new Persona(6, "Donzic");
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		listaPersonas.mostrarLista();
		System.out.println("Número de elementos:"+listaPersonas.size());
		
		
		if(listaPersonas.searchPersona(persona4)) {
			System.out.println(persona4+":Encontrada");
		}else {
			System.out.println(persona4+":No encontrada");
		}


		

	}

}






