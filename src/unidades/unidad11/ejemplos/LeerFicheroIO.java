package unidades.unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFicheroIO {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Deme el nombre del fichero:");
		String nombreFichero = consola.next();
		consola.close();
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(nombreFichero));
			
			String linea;
			
			while((linea = lector.readLine())!=null) {
				System.out.println(linea);
			}
			lector.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero no existe");
		} catch (IOException e) {
			System.err.println("Se ha producido un error en la lectura del fichero");
		}
		

	}

}
