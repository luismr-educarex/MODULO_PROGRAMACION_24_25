package unidades.unidad10.ejemplos.sumas;

public class SumaArgumentos2 {

	public static void main(String[] args) {
		
		int suma=0;
		
		try {
				for(int i=0;i<args.length;i++) {
					suma += Integer.parseInt(args[i]);
				}
		}catch(NumberFormatException e){
			System.out.println("Uno de los argumentos "
					+ "recibidos no es un entero");
		}
		catch(Exception e){
			System.out.println("Se ha producido un error");
		}
		
		System.out.println("Suma:"+suma);
		

	}

}



