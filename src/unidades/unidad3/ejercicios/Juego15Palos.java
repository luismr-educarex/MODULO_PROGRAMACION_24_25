package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Juego15Palos {

	public static void main(String[] args) {
		
		 final char NOMBRE_JUGADOR_1= 'A';
		 final char NOMBRE_JUGADOR_2= 'B';
		Scanner entrada = new Scanner(System.in);
		int fila1=7;
		int fila2=5;
		int fila3=3;
		int totalPalos = fila1+fila2+fila3;
		int numPalos = 0;	
		int fila=0;
		char jugador = NOMBRE_JUGADOR_1;
		do {		
			
			
			for(int i=1;i<=fila1;i++) {
				System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for(int i=1;i<=fila2;i++) {
				System.out.print("|");
			}
			System.out.println();
			System.out.print("  ");
			for(int i=1;i<=fila3;i++) {
				System.out.print("|");
			}
			System.out.println();

			
			System.out.println("Jugador "+jugador);
			System.out.println("Fila:");
			fila = entrada.nextInt();
			System.out.println("Palos:");
			numPalos = entrada.nextInt();			
			totalPalos = totalPalos -numPalos;
			
			
			if(fila==1) {
				fila1=fila1-numPalos;
			}
			if(fila==2) {
				fila2=fila2-numPalos;
			}
			if(fila==3) {
				fila3=fila3-numPalos;
			}
			
			
			
			if(jugador==NOMBRE_JUGADOR_1) {
				jugador=NOMBRE_JUGADOR_2;
			}else {
				jugador=NOMBRE_JUGADOR_1;
			}
			
			
		}while(!(totalPalos==0));
		
		System.out.println("FIN DE JUEGO");
	}

}
