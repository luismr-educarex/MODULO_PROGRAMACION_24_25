package unidades.unidad3.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

	public static void main(String[] args) {
		
		System.out.println("Esto es un palo:|");
		
		final int LIMITE_INFERIOR = 100;
		final int LIMITE_SUPERIOR = 201;
		final int INTENTOS_PERMITIDOS = 5;
		Scanner entrada = new Scanner(System.in);
		
		Random numeroAleatorio = new Random();
		
		int numero = 1+numeroAleatorio.nextInt(100);
		
		int eleccion=0;
		int numIntentos=0;
		
		do {
			System.out.println("Introduzca un número "
					+ "entre "+(LIMITE_INFERIOR+1)+" y el "+(LIMITE_SUPERIOR-1));
			eleccion = entrada.nextInt();
			
			// es válido el dato
			if(eleccion<=LIMITE_INFERIOR || eleccion>=LIMITE_SUPERIOR) {
				System.out.println("El número no es válido "
						+ "está fuera del rango");
			}else {
				
				if(numero>eleccion) {
					System.out.println("El número buscado es mayor");
					
				}else if(numero<eleccion){
					System.out.println("El número buscado es menor");
				}else {
					System.out.println("Son iguales");
				}
				
				
			}
			
			
			numIntentos++;		
	
		}while(numIntentos<INTENTOS_PERMITIDOS && eleccion!=numero);
		
		System.out.println("Intentos:"+numIntentos);
		
		entrada.close();

	}

}






