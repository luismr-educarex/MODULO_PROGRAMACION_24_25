package unidades.unidad4.ejemplos.funciones;
import java.util.Scanner;

public class SumaNumeros {

	// variables globales
	static final int NUM_VECES = 3;
	static  Scanner scanner;
   
	
	public static void main(String[] args) {
   
		scanner = new Scanner(System.in);
    	realizarSumas();  
        scanner.close();
    }
    
    static void realizarSumas() {
		
    	for(int i=1;i<=NUM_VECES;i++) {
        	mostrarMensaje("Intento "+i+" - Ingresa el primer número: ");
            int num1 = leerEntero(scanner);
            mostrarMensaje("Intento "+i+" - Ingresa el segundo número: ");
            int num2 = leerEntero(scanner);  
           
            int suma = sumarEnteros(num1, num2);
            
            mostrarMensaje("La suma es: " + suma);
            
            mostrarMensaje("La suma es: " + sumarEnteros(num1, num2));
        }
		
	}

	static int sumarEnteros(int sumando1,int sumando2)
    {
    	int suma = sumando1 + sumando2;
    	return suma;	
    }
    
    static int leerEntero(Scanner entrada) {
    
    	int numero=entrada.nextInt();
    
    	return numero;
    }
    
    static void mostrarMensaje(String mensaje) {
    	System.out.print("______________________\n");
    	System.out.println(mensaje);
    	System.out.print("......................\n");
    }
    
  
    
}
