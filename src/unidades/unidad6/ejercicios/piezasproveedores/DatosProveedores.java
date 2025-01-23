package unidades.unidad6.ejercicios.piezasproveedores;
class DatosProveedores {
    public static Proveedor[] obtenerProveedores() {
        Proveedor[] proveedores = new Proveedor[10];
        proveedores[0] = new Proveedor(1, "Acero y Cía");
        proveedores[1] = new Proveedor(2, "Herramientas del Norte");
        proveedores[2] = new Proveedor(3, "Materiales Universal");
        proveedores[3] = new Proveedor(4, "Construcciones Omega");
        proveedores[4] = new Proveedor(5, "Industrias Beta");
        proveedores[5] = new Proveedor(6, "Tornillos y Más");
        proveedores[6] = new Proveedor(7, "Proveedora del Sur");
        proveedores[7] = new Proveedor(8, "Suministros Alfa");
        proveedores[8] = new Proveedor(9, "Equipos y Partes");
        proveedores[9] = new Proveedor(10, "Metales del Este");
        return proveedores;
    }
}