package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int mes;
		
		System.out.println("Introduzca el número de mes (1-12):");
		mes = entrada.nextInt();
	
		switch(mes) {
		case 12,1,2:
			System.out.println("Invierno");
		    break;
		case 3,4,5:
			System.out.println("Primavera");
		    break;
		case 6,7,8:
			System.out.println("Verano");
		    break;
		case 9,10,11:
			System.out.println("Otoño");
		    break;
		default:
				System.out.println("Valor no válido");
	    }
		
		
		entrada.close();
		
	}

}
	
	
	
	
	
	
	
