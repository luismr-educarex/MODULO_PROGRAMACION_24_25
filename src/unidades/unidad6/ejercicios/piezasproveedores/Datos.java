package unidades.unidad6.ejercicios.piezasproveedores;
class Datos {
    public Pieza[] piezas = new Pieza[10];
    public Proveedor[] proveedores = new Proveedor[10];
    public Suministro[] suministros = new Suministro[30];

    public Datos() {
        // Inicializar piezas con datos reales
        piezas[0] = new Pieza(1, "Tornillo");
        piezas[1] = new Pieza(2, "Tuerca");
        piezas[2] = new Pieza(3, "Arandela");
        piezas[3] = new Pieza(4, "Clavo");
        piezas[4] = new Pieza(5, "Resorte");
        piezas[5] = new Pieza(6, "Engranaje");
        piezas[6] = new Pieza(7, "Rodamiento");
        piezas[7] = new Pieza(8, "Perno");
        piezas[8] = new Pieza(9, "Bisagra");
        piezas[9] = new Pieza(10, "Remache");

        // Inicializar proveedores con datos reales
        proveedores[0] = new Proveedor(101, "Proveedor A");
        proveedores[1] = new Proveedor(102, "Proveedor B");
        proveedores[2] = new Proveedor(103, "Proveedor C");
        proveedores[3] = new Proveedor(104, "Proveedor D");
        proveedores[4] = new Proveedor(105, "Proveedor E");
        proveedores[5] = new Proveedor(106, "Proveedor F");
        proveedores[6] = new Proveedor(107, "Proveedor G");
        proveedores[7] = new Proveedor(108, "Proveedor H");
        proveedores[8] = new Proveedor(109, "Proveedor I");
        proveedores[9] = new Proveedor(110, "Proveedor J");

        // Inicializar suministros con datos reales
        suministros[0] = new Suministro(1, 101,4, 0.50);
        suministros[1] = new Suministro(1, 102,4, 0.40);
        suministros[2] = new Suministro(2, 103,4, 0.60);
        suministros[3] = new Suministro(2, 104,4, 0.55);
        suministros[4] = new Suministro(3, 105,4, 0.30);
        suministros[5] = new Suministro(3, 106,4, 0.25);
        suministros[6] = new Suministro(4, 107,4, 0.75);
        suministros[7] = new Suministro(4, 108,4, 0.70);
        suministros[8] = new Suministro(5, 109,4, 0.45);
        suministros[9] = new Suministro(5, 110,4, 0.50);
        suministros[10] = new Suministro(6, 101,4, 1.20);
        suministros[11] = new Suministro(6, 102,4, 1.10);
        suministros[12] = new Suministro(7, 103,4, 0.90);
        suministros[13] = new Suministro(7, 104,4, 0.95);
        suministros[14] = new Suministro(8, 105,4, 0.80);
        suministros[15] = new Suministro(8, 106,4, 0.85);
        suministros[16] = new Suministro(9, 107,4, 0.35);
        suministros[17] = new Suministro(9, 108,4, 0.40);
        suministros[18] = new Suministro(10, 109,4, 0.65);
        suministros[19] = new Suministro(10, 110,4, 0.60);
        
    }

	public Pieza[] getPiezas() {
		return piezas;
	}

	public Proveedor[] getProveedores() {
		return proveedores;
	}

	public Suministro[] getSuministros() {
		return suministros;
	}
    
    
    
}