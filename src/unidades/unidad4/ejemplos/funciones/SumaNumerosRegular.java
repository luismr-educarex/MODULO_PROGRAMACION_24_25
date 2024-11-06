package unidades.unidad4.ejemplos.funciones;
import java.util.Scanner;

public class SumaNumerosRegular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Primer intento
        System.out.print("Intento 1 - Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Intento 1 - Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        int suma1 = num1 + num2;
        System.out.println("La suma es: " + suma1);
        
        // Segundo intento
        System.out.print("Intento 2 - Ingresa el primer número: ");
        int num3 = scanner.nextInt();
        System.out.print("Intento 2 - Ingresa el segundo número: ");
        int num4 = scanner.nextInt();
        int suma2 = num3 + num4;
        System.out.println("La suma es: " + suma2);
        
        // Tercer intento
        System.out.print("Intento 3 - Ingresa el primer número: ");
        int num5 = scanner.nextInt();
        System.out.print("Intento 3 - Ingresa el segundo número: ");
        int num6 = scanner.nextInt();
        int suma3 = num5 + num6;
        System.out.println("La suma es: " + suma3);
        
        scanner.close();
    }
}
