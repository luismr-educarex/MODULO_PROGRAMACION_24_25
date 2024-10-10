package unidades.unidad2.ejemplos;

public class Constans {
	
	static final double IRPF = 0.21;
	static final double IVA = 0.17;
	static final double TASA = 0.05;
	static final double TASA_ITV = 0.32;
			

	public static void main(String[] args) {
			
		double sueldo_bruto;
		double sueldo_bruto2;
		double sueldo_neto;
		double sueldo_neto2;
		String nombre;
		String nombre2;
		
		nombre = "Ana";
		sueldo_bruto = 6000;
		sueldo_neto = sueldo_bruto*(1-IRPF);
		
		System.out.println(nombre+" va cobrar este mes:"+sueldo_neto+"€");

		nombre2 = "Tomás";
		sueldo_bruto2 = 4000;
		sueldo_neto2 = sueldo_bruto2*(1-IRPF);
		
		System.out.println(nombre2+" va cobrar este mes:"+sueldo_neto2+"€");

	}

}
