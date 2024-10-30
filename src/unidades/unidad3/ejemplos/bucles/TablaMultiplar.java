package unidades.unidad3.ejemplos.bucles;

import java.util.Scanner;

public class TablaMultiplar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número(1-9)");
		int n = entrada.nextInt();
		
		//recorrer las filas
		for(int fila=n;fila>=1;fila--) {
			//recorrer las columnas
			for(int columna=10;columna>=1;columna--) {
				System.out.printf("%6d",fila*columna);
			}
			System.out.println();
		}
		
		entrada.close();
	}

}





