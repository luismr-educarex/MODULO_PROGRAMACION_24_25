package unidades.unidad6.ejercicios.piezasproveedores;

public class MainConDatos {
	
	public static void main(String[] args) {
		
		// simulación de una fuente de datos
		DatosBD datos = new DatosBD();
		
		Pieza piezas[];
		Proveedor proveedores[];
		Suministro2 suministros[];
		
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
		for(Suministro2 suminitro:suministros) {
			if(suminitro!=null) {
				System.out.println(suminitro);
			}
			
		}
		
		
		
		
		
		
	}

}
