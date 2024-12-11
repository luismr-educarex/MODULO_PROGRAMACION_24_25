package unidades.unidad5.ejemplo.ordenacion;

public class Burbuja {

    public static void main(String[] args) {
        int[] arreglo = {62, 23, 10, 20, 9};
        
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);
        //imprimirArreglo(arreglo);
        
        ordenarBurbuja(arreglo);
        
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método para imprimir un arreglo
    static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    static void mostrarArreglo(int[] arreglo) {
    	for(int elemento:arreglo) {
    		System.out.print(elemento+" ");
    	}
    }

    // Método para realizar la ordenación por burbuja
    static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Compara elementos adyacentes y los intercambia si están en el orden incorrecto
                if (arreglo[j] > arreglo[j+1]) {
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
}