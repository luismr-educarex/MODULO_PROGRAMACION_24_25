package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {

		System.out.println("------- Programa para saber si un número es bisiesto o no -------");
		Scanner entrada = new Scanner(System.in);
		int anio;
		
		System.out.println("Introduzca un año:");
		anio = entrada.nextInt();
		
		if(((anio%4==0)&&(anio%100!=0))||(anio%400==0)) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
	

	}

}






