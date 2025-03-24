package unidades.unidad11.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscribirFicheroNIO {

	public static void main(String[] args) {
		
		try {
		String nombreFichero = "datos3.txt";
		File fichero = new File(nombreFichero);
			
			if(!fichero.exists()) {
				fichero.createNewFile();
				System.out.println("Fichero creado");
			}else {
				System.out.println("Fichero no creado");
			}
			
			Path path = Paths.get(nombreFichero);
			Files.write(path,Arrays.asList("Nuevo datos ....."),StandardOpenOption.APPEND);
		}catch (Exception e) {
			System.out.println("Hay un error");
		}
		
		

	}

}




