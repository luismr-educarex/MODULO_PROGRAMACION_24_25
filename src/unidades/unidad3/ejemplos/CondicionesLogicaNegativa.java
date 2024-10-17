package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class CondicionesLogicaNegativa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduzca su edad:");
		edad = entrada.nextInt();
			
		if(edad<18)
		{
			System.out.println("Eres de menor de edad");
			System.out.println("Tendrás que esperar para conducir legalmente");
		}
		else 
		{
			System.out.println("Eres de mayor de edad");
		}
	}

}



