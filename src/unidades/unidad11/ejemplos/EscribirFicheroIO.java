package unidades.unidad11.ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroIO {

	public static void main(String[] args) {
	
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter("/home/profesor/ficheros/datos6.txt",true));
			
			String datos = "Aquí viene los datos";
			
			escritor.write(datos);
			
			escritor.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}





