package unidades.unidad3.ejemplos.bucles;

import java.util.Scanner;

public class ValidarLetra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char letra;
		do {
			System.out.println("Introduzca una letra(A,B,C)");
			 letra = entrada.next().toLowerCase().charAt(0);
		}while(letra!='a'&& letra!='b'&&letra!='c');
		
		System.out.println("¡¡Has elegido bien!!");
		
		
		

	}

}
