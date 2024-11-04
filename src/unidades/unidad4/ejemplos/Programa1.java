package unidades.unidad4.ejemplos;

public class Programa1 {

	public static void main(String[] args) {
		
		final int CUOTA = 15;
		final int TASA = 2;
		final int NUM_MESES = 3;
		
		double resultado1 = ((CUOTA * 12)+TASA)*NUM_MESES;
		double resultado2 = ((CUOTA * 34)+TASA)*NUM_MESES;
		double resultado3 = ((CUOTA * 5)+TASA)*NUM_MESES;
		double resultado4 = ((CUOTA * 78)+TASA)*NUM_MESES;
		double resultado5 = ((CUOTA * 12)+TASA)*NUM_MESES;
		
		double resultado1b = operacion(CUOTA, TASA, NUM_MESES, 12);
		double resultado2b = operacion(CUOTA, TASA, NUM_MESES, 34);
		double resultado3b = operacion(CUOTA, TASA, NUM_MESES, 5);
		double resultado4b = operacion(CUOTA, TASA, NUM_MESES, 78);
		double resultado5b = operacion(CUOTA, TASA, NUM_MESES, 12);
		

	}
	
	static double operacion(int C,int T,int NM,int dato) {
		
		
		double resultado = ((C * dato)+T)*NM;
		return resultado;
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
