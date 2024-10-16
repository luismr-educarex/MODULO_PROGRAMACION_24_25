package unidades.unidad2.ejemplos;

public class ImprimiendoConFormato {

	public static void main(String[] args) {
		
		
		double cantidad = 828348.341;
		int valorEntero = 56;
		String valorCadena = "Estamos en clase de Programación";
		
		System.out.printf("Total es: %,.2f€%n",cantidad);
		System.out.printf("Total es: %10.2f",cantidad);
		System.out.printf("\n% 4d",valorEntero);
		
		int numeroBinario = 0b101010;
		System.out.printf("El valor en decimal es:%d%n",numeroBinario);
		System.out.printf("El valor en binario es:%s%n",Integer.toBinaryString(numeroBinario));
			
		double nd = 123.94586;
		double numero = 8000000000.576;
		
		
	
		System.out.println("Personas:"+(long) numero+" personas");
		System.out.printf("Personas:%.1f personas%n",numero);

		System.out.print("\n\n");
		
		System.out.printf("%f|%.3f|%.3e|%.3g%n",nd,nd,nd,nd);
	    System.out.printf("\t%f%n\t\t%.3f%n\t\t\t%.3e%n\t%.3g%n",nd,nd,nd,nd);
		
	    
	    int pin = 3838;
	    System.out.printf("PIN:%h",pin);
	

	}

}







