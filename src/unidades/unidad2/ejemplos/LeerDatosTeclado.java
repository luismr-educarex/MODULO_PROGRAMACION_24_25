package unidades.unidad2.ejemplos;

import java.util.Scanner;

public class LeerDatosTeclado {

	public static void main(String[] args) {
		
		   Scanner entrada = new Scanner(System.in);
		   
		   System.out.println("Introduce un número entero:");
		   int nuevoNombre = entrada.nextInt();
		   System.out.printf("Número %d ingresado por el usuario\n",nuevoNombre);
		   
		   //Leer un número long
		   System.out.println("Introduce un número largo(long):");
		   long numeroLargo = entrada.nextLong();
		   System.out.println("Número long:"+numeroLargo);
		   
		   //Leer un número de tipo float
		   System.out.println("INtroduce un número con decimales(float)");
		   float numeroFloat = entrada.nextFloat();
		   System.out.println("Número float:"+numeroFloat);
		   
		   System.out.println("Introduce un número con decimales(double):");
		   double numeroDouble = entrada.nextDouble();
		   System.out.println("Número double:"+numeroDouble);
		   
		   //Leer una palabra (String hasta el primer espacio)
		   // hola qué tal --> hola
		   System.out.println("Introduce una palabra:");
		   String palabra = entrada.next();
		   System.out.println("Palabra ingresada:"+palabra);
		   
		   //Leer una línea
		   entrada.nextLine(); // Limpiar el buffer de entrada
		   System.out.println("Introduce una línea de texto:");
		   String linea = entrada.nextLine();
		   System.out.println("Texto ingresado:"+linea);
		   
		   //Leer un caracter
		   System.out.println("Introduzca un caracter");
		   char caracter = entrada.next().charAt(0);
		   System.out.println("Caracter ingresado:"+caracter);
		   
		   //Leer un valor booleano (true o false)
		   System.out.println("INtroduce un valor booleano:");
		   boolean valorBooleano = entrada.hasNextBoolean();
		   System.out.println("Valor booleano ingresado:"+valorBooleano);
		   

	}

}






