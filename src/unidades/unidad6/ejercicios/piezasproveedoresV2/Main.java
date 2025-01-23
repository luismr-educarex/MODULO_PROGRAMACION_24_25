package unidades.unidad6.ejercicios.piezasproveedoresV2;

public class Main {
	
	public static void main(String[] args) {
		
		// simulación de una fuente de datos
		DatosBD datos = new DatosBD();
		
		Pieza piezas[];
		Proveedor proveedores[];
		Suministro suministros[];
		
		//Simulamos la carga de datos de las tablas
		piezas = datos.piezas; //SELECT * FROM PIEZAS
		proveedores = datos.proveedores; //SELECT * FROM PROVEEDORES
		suministros = datos.suministros;
		
		
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
		
		
		
		
		
		
	}

}
