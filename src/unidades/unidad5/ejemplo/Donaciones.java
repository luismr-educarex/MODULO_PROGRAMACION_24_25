package unidades.unidad5.ejemplo;

import java.util.Scanner;

public class Donaciones {
	
	static Scanner entrada = new Scanner(System.in);
	static final int NUM_MAQUINAS = 6;

	public static void main(String[] args) {
		
		   int maquinas[] = new int[NUM_MAQUINAS];
		   int maximo,minimo;
		   double media;	    
		   maquinas = leerDatos();
		   maximo = obtenerMaximoDonaciones(maquinas);
		   minimo = obtenerMinimoDonaciones(maquinas);
		   media = obtenerMediaDonaciones(maquinas);
		   mostrarDatos(maximo, minimo, media);
		  
	}
	
	
	static void mostrarDatos(int maximo,int minimo, double media) {
		   System.out.println("El máximo de donaciones ha sido:"+maximo);
		   System.out.println("El mínimo de donaciones ha sido:"+minimo);
		   System.out.println("La media de donaciones ha sido:"+media);
	}

	static double obtenerMediaDonaciones(int[] maquinas) {
		
		double media=0;
		int suma=0;
		
		for(int i=0;i<maquinas.length;i++) {
			suma = suma + maquinas[i];
		}
		media = suma/NUM_MAQUINAS;
		
		return media;
	}

	private static int[] leerDatos() {
		
		int datos[] = new int[NUM_MAQUINAS];
		for(int i=0;i<NUM_MAQUINAS;i++) {
			 System.out.println("Introduzca las "
			 		+ "donaciones de la máquina "+(i+1)+":");
			 datos[i] = entrada.nextInt();
		}
		
		return datos;
	}

	static int obtenerMinimoDonaciones(int maquinas[]) {
		
		int minimo = maquinas[0];
		for(int i=1;i<maquinas.length;i++) {
			if(maquinas[i]<minimo) {
				minimo = maquinas[i];
			}
			
		}
		return minimo;
	}

	static int obtenerMaximoDonaciones(int maquinas[]) {
		
		int maximo = maquinas[0];
		
		for(int i=1;i<maquinas.length;i++) {
			if(maquinas[i]>maximo) {
				maximo = maquinas[i];
			}
		}

		return maximo;
	}

}














