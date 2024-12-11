package unidades.unidad5.tareas.debugueando;
public class Debugging {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Suma de los números pares: " + sumEvenNumbers(numbers));
        System.out.println("Elemento mayor del arreglo: " + findMax(numbers));
        System.out.println("Factorial de 5: " + factorial(5));
    }

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) { 
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) { 
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1); 
    }
}
