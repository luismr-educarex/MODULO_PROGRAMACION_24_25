package unidades.unidad8.ejercicios.vehiculosE;

public class Main {

	 static VehiculoElectrico[] vehiculos = new VehiculoElectrico[10];
	
	public static void main(String[] args) {
		
		
		
		VehiculoElectrico v1 = new CocheElectrico("Toyota","Rav4",500,600,4,2);
		VehiculoElectrico v2 = new MotoElectrica("Yamaha","Virago",500,600,700,false);
		VehiculoElectrico v3 = new CocheElectrico("Seat","Ibiza",300,400,3,3);
		VehiculoElectrico v4 = new MotoElectrica("Suziki","R8",200,200,500,false);
		

		addVehiculo(v1);
		addVehiculo(v2);
		addVehiculo(v3);
		addVehiculo(v4);
		addVehiculo(v1);
		addVehiculo(v2);
		addVehiculo(v3);
		addVehiculo(v4);
		addVehiculo(v3);
		addVehiculo(v4);
		addVehiculo(v4);
		
		
		
		System.out.println("Autonomia Real:"+v1.calcularAutonomiaReal(130, "Subida"));
		System.out.println("Autonomia Real:"+v1.calcularAutonomiaReal(120, "Subida"));
		System.out.println("Autonomia Real:"+v1.calcularAutonomiaReal(90, "Subida"));
		
		
		System.out.println("Autonomia Real:"+v2.calcularAutonomiaReal(130, "Subida"));
		System.out.println("Autonomia Real:"+v2.calcularAutonomiaReal(120, "Subida"));
		System.out.println("Autonomia Real:"+v2.calcularAutonomiaReal(90, "Subida"));
		
	
	}
	
	
	private static void addVehiculo(VehiculoElectrico vehiculo) {
		
		int posicionLibre = obtenerPosicionLibre();
		if(posicionLibre!=-1) {
			vehiculos[posicionLibre]=vehiculo;
		}else {
			System.out.println("No se puede insertar más elementos");
		}
		
		
	}
	
	
	
	private static int obtenerPosicionLibre() {
		
		int posicion = -1;
		boolean encontrado = false;
		for(int i=0;i<10 && !encontrado;i++) {
			if(vehiculos[i]==null) {
				posicion=i;
				encontrado=true;
				
			}
		}
		
		return posicion;
	}
	
	
	
}



















