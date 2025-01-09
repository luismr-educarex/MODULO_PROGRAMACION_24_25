package unidades.unidad6.ejemplos.coches;

public class Circuito {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Audi","A3",2014);
		
		Motor motor2 = new Motor('G',120,2000);
		Motor motor3 = new Motor('E',180,2400);
		Motor motor4 = new Motor('D',90,1600);
		
		Coche coche2 = new Coche("BMW","S4",2018,"Azul",motor2);
		Coche coche3 = new Coche("Toyota","Rav4",2022,"Gris",motor3);
		Coche coche4 = new Coche("Seat","Ibiza",2000,"Amarillo",motor4);
		
		Motor motor1 = new Motor('G',180,3000);
		coche1.setMotor(motor1);
	
		
		coche1.mostrarDatos();
		System.out.println(coche1);
		
		
		
		
		

	
		
	}

}
