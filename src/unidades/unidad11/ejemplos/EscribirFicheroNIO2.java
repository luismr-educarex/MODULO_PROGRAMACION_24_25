package unidades.unidad11.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscribirFicheroNIO2 {

	public static void main(String[] args) {
		
		try {
		String nombreFichero = "/home/profesor/ficheros/datos5.txt";
	
			Path path = Paths.get(nombreFichero);
			Files.write(path,Arrays.asList("XXXXXXX"),StandardOpenOption.APPEND);
		}catch (Exception e) {
			System.out.println("Hay un error");
		}
		
		

	}

}




