package unidades.unidad7.ejemplos.envolturas;

public class Envoltura {

	public static void main(String[] args) {
		
		int numero = 10;
		byte numeroEnByte = (byte)numero;
		
		Integer otroNumero = 10;
		Byte otroNumeroEnByte = otroNumero.byteValue();
		
		Integer numero2 = 35;
		int resultado = numero2.compareTo(otroNumero);
		if(resultado<0) {
			System.out.println("Es menor");
		}else {
			System.out.println("Es mayor");
		}
		
		double decimaSimple =  12.89;
		Double numeroDecimal = 12.89;
		double numeroGrande = Double.MAX_VALUE;
		int enteroPequenito = Integer.MIN_VALUE;
		
		System.out.println(Integer.sum(45, 12));
		
		String datos = "79|45.23|Juan";
		
		String datosTroceados[] = datos.split("\\|");
		
		Integer datoNumero = Integer.parseInt(datosTroceados[0]);
		int datoNumeroSimple = datoNumero.intValue();
		
		Double datosDecimal = Double.parseDouble(datosTroceados[1]);
		
		System.out.println("Dato entero:"+datoNumero);
		System.out.println("Dato decimal:"+datosDecimal);
		System.out.println("Nombre:"+datosTroceados[2]);
		
		
		String numeroCadena = String.valueOf(datoNumero);
		String decimalCadena = String.valueOf(datosDecimal);
		
		System.out.println("Dato en formato cadena:"+numeroCadena);
		System.out.println("Dacimal en formato cadena:"+decimalCadena);
		
		
		
		
		
		
		
		
		
		Integer numero3 = Integer.parseInt("79");
		Double decimal = Double.parseDouble("45.23");
		
		int numeroCualquiera = numero3.intValue();
		double numeroDecimeal = decimal.doubleValue();
		
		System.out.println(numero3);
		System.out.println(decimal);
		
		if(numero2>otroNumero) {
			System.out.println("Es mayor");
		}else {
			System.out.println("Es menor");
		}
		
		Integer otroEntero = new Integer(10);
		
		System.out.println(numero);
		System.out.println(otroNumero);
		System.out.println(otroEntero);
		
		
		
		
		

	}

}
