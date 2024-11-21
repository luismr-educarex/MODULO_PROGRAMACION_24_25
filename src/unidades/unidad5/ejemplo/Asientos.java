package unidades.unidad5.ejemplo;

import java.util.Scanner;

public class Asientos {

	static final int NUM_FILAS = 5;
	static final int NUM_COLUMNAS = 6;
	static char[][] asientos = new char[NUM_FILAS][NUM_COLUMNAS];
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		inicializarAsientos();
		mostrarAsientos();
		
		char opcion=0;
		int asiento[];
		do {
			mostrarMenu();
			opcion = leerOpcion();
			
			switch(opcion) {
			
			case 'R':
				asiento = pedirDatos();
				reservarAsiento(asiento);
				mostrarAsientos();
			break;
			case 'A':
				asiento = pedirDatos();
				anularAsiento(asiento);
				mostrarAsientos();
			break;
			default:
				cerrarPrograma();
			
			}
			
		}while(opcion!='S');
	}

 static void anularAsiento(int[] asiento) {
		 asientos[(asiento[0])-1][(asiento[1])-1] = 'L';
		
	}

	static int[] pedirDatos() {
		
		 
		int asiento[] = new int[2];
		int fila;
		int columna;
		
		System.out.println("Introduzca fila:");
		fila = entrada.nextInt();
		System.out.println("Introduzca la columna");
		columna= entrada.nextInt();
		
		asiento[0]=fila;
		asiento[1]=columna;
		
		
		return asiento;
		
		
	}

	static void reservarAsiento(int asiento[]) {
		
		asientos[(asiento[0])-1][(asiento[1])-1] = 'R';
		
	}

	static void cerrarPrograma() {
		System.out.println("Muchas gracias. No olvide realizar la compra de sus entreadas");
		
	}

	private static char leerOpcion() {
		char opcion = entrada.next().toUpperCase().charAt(0);
		return opcion;
	}

	static void mostrarMenu() {
		System.out.println("----Reserva de asientos---");
		System.out.println("R:Reservar");
		System.out.println("A:Anular");
		System.out.println("S:Salir");
	}

	static void mostrarAsientos() {
		 //recorrer las filas
		for(int i=0;i<NUM_FILAS;i++) {
			//recorrer las columnas de cada fila
			for(int j=0;j<NUM_COLUMNAS;j++) {
				System.out.printf("%3s",asientos[i][j]);
			}
			System.out.println();
			
		}
		
	}

	static void inicializarAsientos() {
		
		 //recorrer las filas
		for(int i=0;i<NUM_FILAS;i++) {
			for(int j=0;j<NUM_COLUMNAS;j++) {
				asientos[i][j]='L';
			}
			
			
		}
		 
	}

}
