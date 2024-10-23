package unidades.unidad3.ejemplos.bucles;

public class BucleDoWhile {

	public static void main(String[] args) {
	
		int numero = 11;
	
		while(numero>10) {
			System.out.println("EN WHILE-> Número:"+numero);
			numero--;
			
		}
		
		do {
			System.out.println("EN DO-WHILE -> Número:"+numero);
			numero--;
			
		}while(numero>10);
		
		
	}

}
