package unidades.unidad2.ejercicios;

import java.util.Scanner;

public class TablaClientes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dni = "";
		String nombre = "";
		String tlf= "";
		
		System.out.println("Introduce el dni:");
		dni = entrada.next();
		entrada.nextLine();
		System.out.println("Introduce el nombre:");
		nombre = entrada.next();
		entrada.nextLine();
		System.out.println("Introduce el teléfono:");
		tlf = entrada.next();

		String dni2 = "";
		String nombre2 = "";
		String tlf2= "";
		
		System.out.println("Introduce el dni:");
		dni2 = entrada.next();
		entrada.nextLine();
		System.out.println("Introduce el nombre:");
		nombre2 = entrada.next();
		entrada.nextLine();
		System.out.println("Introduce el teléfono:");
		tlf2 = entrada.next();
		
		System.out.printf("DNI\t\tNOMBRE\t\tTLF%n");
		System.out.printf("%s\t%s\t%s%n",dni,nombre,tlf);
		System.out.printf("%s\t%s\t%s%n",dni2,nombre2,tlf2);
		
		

	}

}
