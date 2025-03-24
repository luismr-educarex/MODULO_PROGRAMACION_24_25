package unidades.unidad11.ejemplos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerFicheroNIO {

	public static void main(String[] args) {
		
		try {
			List<String> lineas = Files.readAllLines(Paths.get("reservas_vuelos.txt"));
			for(String linea:lineas) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}





