package unidades.unidad6.ejercicios.controlVendimia;

public class Main {

	private static final int NUM_ZONAS = 6;
	private static final int NUM_RECOLE = 10;
	private static Zona[] zonas;
	
	public static void main(String[] args) {
		
		zonas = new Zona[NUM_ZONAS];
		
		Zona zona1 = new Zona(1,new double[NUM_RECOLE]);
		Zona zona2 = new Zona(2,new double[NUM_RECOLE]);
		Zona zona3 = new Zona(3,new double[NUM_RECOLE]);
		Zona zona4 = new Zona(4,new double[NUM_RECOLE]);
		Zona zona5 = new Zona(5,new double[NUM_RECOLE]);
		Zona zona6 = new Zona(6,new double[NUM_RECOLE]);
		
		zonas[0]=zona1;
		zonas[1]=zona2;
		zonas[2]=zona3;
		zonas[3]=zona4;
		zonas[4]=zona5;
		zonas[5]=zona6;
		
		addCantidad(2000,1);
		addCantidad(3000,1);
		addCantidad(1000,3);
		addCantidad(4000,5);
		
	    double total = obtenerTotalZonas();
	    System.out.println("Total cantidad:"+total);
	
	}
	
	private static void addCantidad(double cantidad,int zona) {
		zonas[zona].insertarCantidadRecoleccion(cantidad);
	}
	
	private static double obtenerTotalZonas() {
		
		double total=0;
		
		for(int i=0;i<zonas.length;i++) {
			total += zonas[i].obtenerTotal();
			
		}
		
		
		return total;

		
	}
	
	
	
	

}













