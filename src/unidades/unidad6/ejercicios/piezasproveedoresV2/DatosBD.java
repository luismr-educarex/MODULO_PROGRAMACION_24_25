package unidades.unidad6.ejercicios.piezasproveedoresV2;

import java.util.Random;

class DatosBD {
	public static final int NUM_PIEZAS = 10;
	public static final int NUM_PROVEEDORES = 10;
	public static final int NUM_SUMINISTROS = 100;
	public static final int CANTIDAD_MINIMA_SUMINISTRO = 10;
	public static final int CANTIDAD_MAXIMA_SUMINISTRO = 100;
    public Pieza[] piezas = new Pieza[NUM_PIEZAS];
    public Proveedor[] proveedores = new Proveedor[NUM_PROVEEDORES];
    public Suministro[] suministros = new Suministro[NUM_SUMINISTROS];
 

    public DatosBD() {
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
        Random random = new Random();
        for(int i=0;i<suministros.length;i++) {
        	Pieza pieza = piezas[random.nextInt(NUM_PIEZAS)];
        	Proveedor proveedor = proveedores[random.nextInt(NUM_PROVEEDORES)];
        	int cantidad = CANTIDAD_MINIMA_SUMINISTRO + random.nextInt(CANTIDAD_MAXIMA_SUMINISTRO+1); // Número entre el 10 y 100
        	double precio = 0.50 + (random.nextDouble()*9.50);
        	precio = Math.round(precio*100)/100;
        	suministros[i] =  new Suministro(pieza, proveedor, cantidad, precio);
        }
        
        
        
        
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