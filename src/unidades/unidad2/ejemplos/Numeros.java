package unidades.unidad2.ejemplos;

public class Numeros {

	public static void main(String[] args) {
		
		int numeroEntero = 23;
		Integer numeroEntero2 = Integer.valueOf(23);
		double metros = 34.6;
		Double metros3 = Double.valueOf(metros);

		
		
		
		//Número binario
		short binario = 0b0101;
		long hex = 0xFF_EC_DC_5E;
		int octal = 07_7_5_2;
		int decimal = 89383;
		
		
		
		
		short binario2 = 0b0_1_0_1;
		long binario3 = 0b1010_0000_1111_1110;
		long binario4 = 0b1010000011111110;
		long direccionIP = 0b11000000_10101000_00000000_01111101;
		long direccionIP2 = 0b1100_0000_1010_1000_0000_0000_0111_1101;

		System.out.println("Binario:"
		+String.format("%4s",Integer.toBinaryString(binario)).
				replace(' ','0'));
		System.out.printf("Binario:%b",binario);
		
		
		
		
		short binarioSuma = 0b0_1_0_0 + 0b0_1_0_1;
		System.out.print("\nSUMA:"+binarioSuma);
		
		
		int hex1 = 0xF;
		int hex2 = 0x5;
		hex1++;
		
		int sumaHex = hex1+hex2;
		System.out.println("\nSUMA:"+sumaHex);
		
		
		
		
		
		
		
		
		
		
		

	}

}
