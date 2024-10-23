package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class RecreoBiblioteca {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		int contadorLeer=0;
		int contadorEstudiar=0;
		int contadorJugarA=0;
		boolean seguir =false;
		
		
		
		while(seguir) {
			
			System.out.println("---- recreo biblio ----");
			System.out.println("1. Leer");
			System.out.println("2. Estudiar");
			System.out.println("3. Jugar ajedrez");
			System.out.println("4. Salir");
			opcion = entrada.nextInt();
			
			System.out.println("Opción:"+opcion);
			
			switch(opcion) {
				case 1:
					System.out.println("Opción leer");
					contadorLeer++;
				break;
				case 2:
					System.out.println("Opción estudiar");
					contadorEstudiar++;
				break;
				case 3:
					System.out.println("Opción jugar");
					contadorJugarA++;
				break;
				case 4:
					System.out.println("Muchas gracias");
					seguir=false;
				break;
				default:
					System.out.println("Opción no válida");
			
			} // fin del switch
			
		} // fin del while
		
		
		System.out.println("--- ESTADÍSTICAS ----");
		System.out.println("Usuarios lectores:"+contadorLeer);
		System.out.println("Usuarios estudiosos:"+contadorEstudiar);
		System.out.println("Usuarios jugones:"+contadorJugarA);
		
		System.out.println("Total de usuarios:"+
		(contadorLeer+contadorEstudiar+contadorJugarA));
		
		
		entrada.close();
		
	} // fin del main

}




















