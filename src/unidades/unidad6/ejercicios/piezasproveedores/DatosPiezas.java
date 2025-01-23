package unidades.unidad6.ejercicios.piezasproveedores;
class DatosPiezas {
    public static Pieza[] obtenerPiezas() {
        Pieza[] piezas = new Pieza[10];
        piezas[0] = new Pieza(1, "Tornillo");
        piezas[1] = new Pieza(2, "Tuerca");
        piezas[2] = new Pieza(3, "Clavo");
        piezas[3] = new Pieza(4, "Arandela");
        piezas[4] = new Pieza(5, "Perno");
        piezas[5] = new Pieza(6, "Taco");
        piezas[6] = new Pieza(7, "Bulón");
        piezas[7] = new Pieza(8, "Resorte");
        piezas[8] = new Pieza(9, "Pasador");
        piezas[9] = new Pieza(10, "Remache");
        return piezas;
    }
}