package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int dia;
		
		
		System.out.println("Introduzca el número del día (1-7):");
		dia = entrada.nextInt();
	
		switch(dia) {
			case 1:
				System.out.println("lunes");
				break;
			case 2:
				System.out.println("martes");
				break;
			case 3:
				System.out.println("miércoles");
				break;
			case 4:
				System.out.println("jueves");
				break;
			case 5:
				System.out.println("viernes");
				break;
			case 6:
				System.out.println("sábado");
				break;
			case 7:
				System.out.println("domingo");
				break;
			default:
				System.out.println("NO es una opción válida");
		}
		
		entrada.close();
		
	}

}











