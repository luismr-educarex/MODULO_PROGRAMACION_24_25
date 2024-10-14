package unidades.unidad2.ejemplos;

public class ImprimiendoConFormato {

	public static void main(String[] args) {
		
		
		double cantidad = 828348.341;
		int valorEntero = 56;
		String valorCadena = "Estamos en clase de Programación";
		
		System.out.printf("Total es: %,.2f€%n",cantidad);
		System.out.printf("Total es: %-10.2f",cantidad);
		System.out.printf("\n% 4d",valorEntero);
	

	}

}
