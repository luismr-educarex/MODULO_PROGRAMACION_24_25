package unidades.unidad2.ejemplos;

public class Operadores {

	public static void main(String[] args) {

		int numeroA = 20,numeroB=15,numeroC=5;

		System.out.println("Número A:"+numeroA);
		System.out.println("Número B:"+numeroB);
		
		numeroA++;
		//numeroA = numeroA+1;
		System.out.println("Número A:"+numeroA);
		
		numeroB--;
		//numeroB = numeroB-1
		System.out.println("Número B*:"+(numeroB+20));
		
		numeroB--;
		System.out.println("Número B:"+numeroB);
		
		numeroA+=10;
		//numeroA = numeroA+10
		System.out.println("Número A:"+numeroA);
		
		numeroA=+10;
		System.out.println("Número A:"+numeroA);
		
		numeroB = numeroC--;
		System.out.println("Número B:"+numeroB);
		System.out.println("Número C:"+numeroC);
		
		numeroA = numeroC++;
		System.out.println("Número A:"+numeroA);
		System.out.println("Número C:"+numeroC);
		
	}

}



