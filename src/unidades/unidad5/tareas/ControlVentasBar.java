package unidades.unidad5.tareas;

import java.util.Scanner;

public class ControlVentasBar {

    // Declaración de un array de días de la semana desde martes hasta domingo
    static final String DIAS[] = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
    static final int DOMINGO = 5;
    static final String MENSAJE_NO_SUPERA_MEDIA_DOMINGO = "NO";
    static final String MENSAJE_SUPERA_MEDIA_DOMINGO = "SI";
    static final String MENSAJE_IGUAL_MEDIA_DOMINGO = "EMPATE";
    
    public static void main(String[] args) {
        // Array para almacenar las ventas diarias (máximo 24 registros, aunque solo usaremos los días de la semana)
        double datos[] = new double[24];

        // Llama al método para pedir los datos de las ventas
        pedirDatos(datos);

        // Llama al método para obtener el índice del día con más ventas
        int diaMaximo = obtenerDiaMaximoVentas(datos);

        // Llama al método para obtener el índice del día con menos ventas
        int diaMinimo = obtenerDiaMinimoVentas(datos);

        // Compara la media de las ventas de todos los días con las ventas del domingo
        String comparacionMedia = comparacionMediaDomingo(datos);

        // Muestra los resultados: día con máximas ventas, mínimas ventas y comparación con el domingo
        mostrarDatos(diaMaximo, diaMinimo, comparacionMedia);
    }

  
    // Método para pedir datos de ventas al usuario
    static void pedirDatos(double[] datos) {
        Scanner entrada = new Scanner(System.in);
        double numero = 0;
        int numeroDatos = 0;

        // Bucle para leer ventas mientras el usuario no introduzca -1
        do {
            numero = entrada.nextDouble(); // Lee un número
            if (numero > 0) { // Solo guarda números positivos
                datos[numeroDatos] = numero;
                numeroDatos++;
            }
        } while (numero != -1); // Termina cuando se introduce -1
        
        entrada.close();
    }
    
   // Método que muestra los resultados finales
    private static void mostrarDatos(int diaMaximo, int diaMinimo, String comparacion) {
        // Imprime el nombre del día con máximas y mínimas ventas y la comparación con el domingo
        System.out.println(DIAS[diaMaximo] + "      " + DIAS[diaMinimo] + "    " + comparacion);
    }

    
    /*
     *  Método que encuentra el índice del día con las ventas máximas
     *  En esta función lo importante es encontrar el número del día al que corresponde 
     *  el valor máximo. 
     *  No es necesario devolver el valor máximo, porque en este caso, no nos lo piden.
     */
    static int obtenerDiaMaximoVentas(double[] datos) {
        int dia = 0; // Comienza desde el primer día (martes)
        double maximo = 0; // Inicializa el máximo como el valor 0

        // Recorre todas las ventas
        for (int i = 0; i < datos.length; i++) {
            // Si encuentra un valor mayor al actual máximo, lo actualiza
            if (datos[i] > maximo) {
                maximo = datos[i];
                dia = i;
            }
        }

        return dia; // Devuelve el índice del día con las ventas máximas
    }
    
    /*
     *  Método que encuentra el índice del día con las ventas mínimas
     *  En esta función lo importante es encontrar el número del día al que corresponde 
     *  el valor mínimo. 
     *  No es necesario devolver el valor mínimo, porque en este caso, no nos lo piden.
     */
    static int obtenerDiaMinimoVentas(double[] datos) {
        int dia = 0; // Comienza desde el primer día (martes)
        double minimo = 0; // Inicializa el mínimo como el valor 0

        // Recorre todas las ventas
        for (int i = 0; i < datos.length; i++) {
            // Si encuentra un valor menor al actual mínimo, lo actualiza
            if (datos[i] < minimo) {
                minimo = datos[i];
                dia = i;
            }
        }

        return dia; // Devuelve el índice del día con las ventas mínimas
    }
    
 // Método que calcula la media de las ventas
    private static double obtenerMedia(double[] datos) {
        double total = 0;
        double media;
        // Suma todas las ventas
        for (double dato : datos) {
            total += dato;
        }
        // Calcula la media dividiendo el total entre el número de elementos
        media = total / datos.length;

        return media;
    }
    
    // Método que compara la media de las ventas de todos los días con las ventas del domingo
    private static String comparacionMediaDomingo(double[] datos) {
        String resultado = "";
        // Calcula la media de las ventas
        double media = obtenerMedia(datos);

        // Compara la media con las ventas del domingo (índice 5 en el array)
        if (media > datos[DOMINGO]) {
            resultado = MENSAJE_NO_SUPERA_MEDIA_DOMINGO; // La media es mayor que las ventas del domingo
        } else if (media == datos[DOMINGO]) {
            resultado = MENSAJE_IGUAL_MEDIA_DOMINGO; // La media es igual a las ventas del domingo
        } else {
            resultado = MENSAJE_SUPERA_MEDIA_DOMINGO; // La media es menor que las ventas del domingo
        }

        return resultado;
    }
    
}
