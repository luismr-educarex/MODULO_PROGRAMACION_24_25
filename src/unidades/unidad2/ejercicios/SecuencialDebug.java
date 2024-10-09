package unidades.unidad2.ejercicios;
public class SecuencialDebug {
    // Constantes
    public static final int VALOR_INICIAL = 10;
    public static final double TASA_INTERES = 0.05;
    public static final float PRECIO_PRODUCTO = 19.99f;

    public static void main(String[] args) {
        // Declaración de variables
        int cantidad = VALOR_INICIAL;
        double interesGenerado;
        float totalCompra;
        long numeroGrande = 5000000000L; // Usamos un long para un número grande
        short edad = 25;
        byte descuento = 20;

        // Operaciones con las variables
        interesGenerado = cantidad * TASA_INTERES; // Cálculo del interés
        System.out.println("Interés generado: " + interesGenerado);

        totalCompra = PRECIO_PRODUCTO * cantidad; // Total sin descuento
        System.out.println("Total sin descuento: " + totalCompra);

        // Aplicamos un descuento
        totalCompra -= totalCompra * (descuento / 100.0); // Convertimos byte a double para la operación
        System.out.println("Total con descuento: " + totalCompra);

        // Operación con número grande
        numeroGrande += cantidad * edad; // Modificamos el número grande con multiplicación
        System.out.println("Número grande después de la operación: " + numeroGrande);

        // División de enteros y comprobación
        int resultadoDivision = cantidad / 3;
        System.out.println("Resultado de la división de cantidad entre 3: " + resultadoDivision);

        // Operación mixta con distintos tipos
        double operacionMixta = (cantidad + numeroGrande) * TASA_INTERES;
        System.out.println("Resultado de la operación mixta: " + operacionMixta);
    }
}
