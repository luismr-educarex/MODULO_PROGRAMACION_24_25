package unidades.unidad6.ejercicios.piezasproveedores;

public class Main {

	public static void main(String[] args) {
		
		Pieza pieza1 = new Pieza(1000,"Tornillo");
		Pieza pieza2 = new Pieza(1001,"Tuerca");
		
		
		Pieza[] piezas = new Pieza[2];
		
		piezas[0] = pieza1;
		piezas[1] = pieza2;
		
		Proveedor proveedor1 = new Proveedor(1, "Tyndal");
		Proveedor proveedor2 = new Proveedor(2, "Ibn");
		
		Proveedor[] proveedores = new Proveedor[2];
		
		proveedores[0] = proveedor1;
		proveedores[1] = proveedor2;
		
		Suministro suministro1 = new Suministro(1000, 2, 20, 12.45);
		Suministro suministro2 = new Suministro(1000, 1, 2, 11.5);
		Suministro suministro3 = new Suministro(1001, 2, 12, 4.80);
		Suministro suministro4 = new Suministro(1001, 1, 67, 4.45);
		
		
		Suministro[] suministros = new Suministro[4];
		
		suministros[0] = suministro1;
		suministros[1] = suministro2;
		suministros[2] = suministro3;
		suministros[3] = suministro4;
		
		System.out.println("---PIEZAS---");
		for(Pieza pieza:piezas) {
			if(piezas!=null) {
				System.out.println(pieza);
			}
			
		}
		
		System.out.println("---PROVEEDORES---");
		for(Proveedor proveedor:proveedores) {
			if(proveedor!=null) {
				System.out.println(proveedor);
			}
			
		}
		
		System.out.println("---SUMINISTROS ---");
		for(Suministro suminitro:suministros) {
			if(suminitro!=null) {
				System.out.println(suminitro);
			}
			
		}
		
		//opcion 1
		Datos datos  = new Datos();
		Pieza [] tablaPiezas = datos.piezas;
		Proveedor [] tablaProveedores = datos.proveedores;
		Suministro [] tablaSuministro = datos.suministros;
		
		//opcion 2
		Pieza [] tablaPiezas2 = DatosPiezas.obtenerPiezas();
		Proveedor [] tablaProveedores2 = DatosProveedores.obtenerProveedores();
		Suministro[] tablaSuministro2 = DatosSuministros.obtenerSuministros();
		
		/*
		for(int i=0;i<piezas.length;i++) {
			Pieza pieza = piezas[i];
			if(pieza!=null) {
				System.out.println(pieza);
			}
			
		}
		*/
		

	}

}












