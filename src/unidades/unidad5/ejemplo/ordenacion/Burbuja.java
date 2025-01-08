package unidades.unidad5.ejemplo.ordenacion;

public class Burbuja {

	public static void main(String[] args) {
		
		int[] datos = {62,23,10,20,9,45,2,89,124,1,98,13,12,4,6,37};
		
		System.out.println("Array original");
		mostrarArray(datos);
		ordenarPorBurbuja(datos);
		System.out.println("\nArray ordenado");
		mostrarArray(datos);
		
		
	}

	static void ordenarPorBurbuja(int[] datos) {
		
		int n = datos.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(datos[j]>datos[j+1]) {
					int tmp = datos[j+1];
					datos[j+1] = datos[j];
					datos[j] = tmp;
				}
			}
		}
		
	}

     static void mostrarArray(int[] datos) {
		/*
		for(int i=0;i<datos.length;i++) {
			int dato = datos[i];
			System.out.println(dato+" ");
		}*/
		
		for(int dato:datos) {
			System.out.print(dato+" ");
		}
		
	}
	
	

}







