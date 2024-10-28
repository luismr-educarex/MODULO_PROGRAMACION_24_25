package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int numero1=0,numero2=0;
		char opcion;
		int suma;
		int resta;
		int multiplicaion;
		double division;
		
		
		do {
			System.out.println("Primer número:");
			numero1 = entrada.nextInt();
			System.out.println("Segundo número");
			numero2 = entrada.nextInt();
			
			System.out.println("--- MENÚ ---");
			System.out.println("S=suma");
			System.out.println("R=resta");
			System.out.println("M=multiplicación");
			System.out.println("D=división");	
			System.out.println("C=cerrar programa");
			
			System.out.println("Elija una opción(S/R/M/D/C) y enter ");
			
			opcion = entrada.next().charAt(0);
			
			System.out.println("DATOS");
			System.out.println("NÚMERO 1:"+numero1);
			System.out.println("NÚMERO 2:"+numero2);
			System.out.println("OPCIÓN:"+opcion);
			
			switch(opcion) {
			
				case 'S':
					 suma = numero1+numero2;
					System.out.println("La suma es:"+suma);
				break;	
				case 'R':
					 resta = numero1-numero2;
					 System.out.println("La resta es:"+resta);
				break;
				case 'M':
					 multiplicaion = numero1*numero2;
					 System.out.println("El producto es:"+multiplicaion);
				break;
				case 'D':
					 if(numero2!=0) {
						 division = numero1/numero2;
						 System.out.println("La división es:"+division);
					 }else {
						 System.out.println("No se puede dividir entre 0");
					 }
		
				break;
				case 'C':
					 System.out.println("Muchas gracias");
				break;
				default:
					System.out.println("Opción no reconocida");
			}
			
			
		}while(opcion!='C');
		

		
		/*
		
		if(opcion=='S') {
			
		}else if(opcion=='R') {
			
		}else if(opcion=='M') {
			
		}else if(opcion=='D') {
			
		}else if(opcion=='C') {
			
		}else {
			
		}
		*/
		
		entrada.close();
		
		
	}
}








