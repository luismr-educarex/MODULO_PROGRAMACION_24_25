package unidades.unidad2.ejercicios;

public class Ejercicio14 {

	public static void main(String[] args) {
	
		int N = 10;
		double A = 3.5;
		char C = '2';

		double suma;
		double diferencia;
		
		//El valor de cada variable
		System.out.println("Estos son los valores"+N+" "+A+" "+C);
		System.out.printf("Estos son los valores:%d-%f-%c",N,A,C);
		
		suma = N+A;
		System.out.println("\nSuma de N+A:"+suma);
		
		diferencia = A-N;
		System.out.println("\nDiferencia de A-N:"+diferencia);
		
		System.out.printf("Valor numérico de C:%d",(int)C);
		
		
	}

}






