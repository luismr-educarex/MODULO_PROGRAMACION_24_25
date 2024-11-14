package unidades.unidad4.ejemplos.funciones;

import java.util.Random;

public class Utilidades {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int min = 1;
		int max =20;
		
		int numeroAleatorio = random.nextInt(max-min+1)+min;
		
		long timpoInicio = System.currentTimeMillis();
		System.out.println("Inicio");
		esperar(numeroAleatorio);
		long timpoFinal = System.currentTimeMillis();
		System.out.println("Fin");
		
		System.out.println("Tiempo empleado:"+(timpoFinal-timpoInicio)/1000);
		
		


	}
	
    static void esperar(int segundos) {
    	
    	
    		try {
				Thread.sleep(segundos*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    	
    }

}








