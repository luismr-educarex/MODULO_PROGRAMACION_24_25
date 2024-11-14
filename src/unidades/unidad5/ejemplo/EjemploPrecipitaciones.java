package unidades.unidad5.ejemplo;

public class EjemploPrecipitaciones {

	static final int TAM  = 4;
	
	public static void main(String[] args) {
	
		//Crear un array, inicializando su contenido
		//El número de elementos que colocamos dentro de {}
		//fija el tamaño del array. En este caso 4
		int []temperaturas = {16,24,19,9};
		
		//Creamos el array indicando el tamaño que tiene
		//pero de momento está vacío. 
		int precipitaciones[] = new int[TAM];
		
		//Asignamos valores a las distitnas posiciones del array
		//teniendo en cuenta que empieza en 0 y termina en tamaño-1
		//que en este caso es 3 (4-1)
		precipitaciones[0] = 24;
		precipitaciones[1] = 67;
		precipitaciones[2] = 12;
		precipitaciones[3] = 90;
		
		//Para recorrer los arrays podemos usar bucles for
		//o while. Se utilizan más los bucles for.
		//Bucle for para recorrer el array temperaturas
		System.out.println("Temperaturas");
		for(int i=0;i<temperaturas.length;i++) {
			System.out.println(temperaturas[i]);
		}
		//Bucle while para recorrer el array precipitaciones
		System.out.println("Precipitaciones");
		int i = 0;
		while(i<precipitaciones.length) {
			System.out.println(precipitaciones[i]);
			i++;
		}

	}
	
}








