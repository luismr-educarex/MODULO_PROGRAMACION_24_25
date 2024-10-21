package unidades.unidad3.ejemplos;

public class MayorConTernario {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 10;
		
		int mayor = (a>b)?a:b;
		
		System.out.println("El mayor es:"+mayor);
		// --------------------------------------------
		
		if(a==b) {
			System.out.println("Son iguales");
		}else {
			if(a>b) {
				mayor = a;
			}else {
				mayor = b;
			}
			
			System.out.println("Mayor:"+mayor);
		}
		// --------------------------------------------
		
		System.out.println((a==b)?"Son iguales":
						   (a>b)?"mayor:"+a:"mayor:"+b);
				

	}

}
