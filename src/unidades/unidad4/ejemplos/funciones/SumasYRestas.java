package unidades.unidad4.ejemplos.funciones;

import java.util.Scanner;

public class SumasYRestas {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		char operacion = pedirOperacion();
		int numVeces = pedirNumeroVecesOperacion();
		realizarOperacion(operacion,numVeces);
		
		//realizarOperacion(pedirOperacion(),pedirNumeroVecesOperacion());
		
		

	}



	  static void realizarOperacion(char operacion, int numVeces) {
			switch (operacion) {
			case 'S': 
				mostrarMensaje("Usted quiere sumar "+numVeces+" veces");
		    break;
		    
			case 'R': 
				mostrarMensaje("Usted quiere restar "+numVeces+" veces");
		    break;
			
			
			}
		
	}



	static int pedirNumeroVecesOperacion() {
		
		 int veces=0;
			
			do {
				mostrarMensaje("Introduzca número de veces(1-3)");
				veces = entrada.nextInt();

			}while(veces<=0 || veces>3);
			
			
			return veces;
	}



	static char pedirOperacion() {
		
		char opcion=0;
		
		do {
			
			mostrarMensaje("¿Sumar(S) o restar(R)?");
		
			opcion = entrada.next().toUpperCase().charAt(0);

		}while(opcion!='S' && opcion!='R');
		
		
		return opcion;
	}



	 static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}










