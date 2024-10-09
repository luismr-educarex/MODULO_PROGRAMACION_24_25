package unidades.unidad2.ejemplos;

public class VariablesTexto {

	public static void main(String[] args) {
		
		char letra = 'C';
		char letraNumerica = '4';
		String dato = "casa";
		char d = 'c';
		char a = 'a';
		char t = 's';
		char o = 'a';
		int numero = 35;
		String nombre = "Juan";
		char grupo = 'C';
	
		System.out.println("Imprime un salto de línea");
		System.out.print("Imprime el texto solamente");
		System.out.printf("hola %s tienes %d "
				+ "años y estás en el grupo %c"
				,nombre,numero,grupo);
		
		String palabra = "Buenos días";
		String codigo = "C";
		String id = "3";
		
		System.out.println(letra);
		System.out.println(letraNumerica);
		System.out.println(palabra);
		System.out.println(codigo);
		System.out.println(id);
		
		System.out.println(letra+" "+letraNumerica
				+" "+palabra+" "+codigo+" "+id);
		
		
		

	}

}
