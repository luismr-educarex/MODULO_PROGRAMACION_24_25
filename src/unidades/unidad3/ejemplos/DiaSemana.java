package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int dia;
		
		
		System.out.println("Introduzca el número del día (1-7):");
		dia = entrada.nextInt();
	
		if(dia==1) {
			System.out.println("LUNES :-(");
		}
		else if(dia==2) {
			System.out.println("MARTES :-|");
		}
		else if(dia==3) {
			System.out.println("MIERCOLES :-/");
		}
		else if(dia==4){
			System.out.println("JUEVES :-]");
		}
		else if(dia==5){
			System.out.println("VIERNES :-)");
		}
		else if(dia==6){
			System.out.println("SÁBADO ;-)");
		}
		else if(dia==7){
			System.out.println("DOMINGO :-[");
		}
		else {
			System.out.println("Su número de día está fuera de rango.");
		}
		
		
		entrada.close();
		
	}

}











