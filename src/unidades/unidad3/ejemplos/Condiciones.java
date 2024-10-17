package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class Condiciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		String tieneCoche;
		
		System.out.println("Introduzca su edad:");
		edad = entrada.nextInt();
		
		
		if(edad>=18)
		{
			System.out.println("Eres de mayor de edad");
			
			System.out.println("¿Tienes coche?(S/N)");	
			tieneCoche = entrada.next();
			
			if(tieneCoche.equals("S")) {
				System.out.println("Vale,genial no necesitas coche");
			}else {
				System.out.println("Te vendo uno");
			}
		}
		else 
		{
			System.out.println("Eres de menor de edad");
			System.out.println("Tendrás que esperar para conducir legalmente");
		}
		

	}

}






