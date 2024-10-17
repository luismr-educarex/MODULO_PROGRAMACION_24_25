package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class Votaciones {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		int votacion;
		
		
		System.out.println("Introduzca su votación:\n0-MAL\n1-REGULAR\n2-BIEN\n4-MUY BIEN");
		votacion = entrada.nextInt();
		
		
		if((votacion>=0)&&(votacion<=3)) { // dato correcto
			
			if(votacion==0) {
				System.out.println("MUY MAL, UN DESASTRE!! FATAL!! CARA TRISTE!!");
			}
			else if(votacion==1) {
				System.out.println("REGULAR");
			}
			else if(votacion==2) {
				System.out.println("BIEN!!");
			}
			else{
				System.out.println("MUY BIEN, GENIAL!!!CARA CONTENTA!!");
			}
		
		}else { //dato incorrecto
			System.out.println("Su dato está fuera de rango.");
			
		}
		
		
	}

}












