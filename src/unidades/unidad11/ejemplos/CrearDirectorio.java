package unidades.unidad11.ejemplos;

import java.io.File;

public class CrearDirectorio {

	public static void main(String[] args) {
	
		File directorio = new File("/home/profesor/ficheros");
		
		if(directorio.mkdir()) {
			System.out.println("Directorio creado");
		}else {
			System.out.println("Directorio no creado");
		}

	}

}
