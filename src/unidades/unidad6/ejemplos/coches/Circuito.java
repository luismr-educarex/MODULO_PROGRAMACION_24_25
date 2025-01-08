package unidades.unidad6.ejemplos.coches;

public class Circuito {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Audi","A3",2014,"Rojo",'D');
		Coche coche2 = new Coche("BMW","S4",2018,"Azul",'G');
		Coche coche3 = new Coche("Toyota","Rav4",2022,"Gris",'E');
		Coche coche4 = new Coche("Seat","Ibiza",2000,"Amarillo",'D');
		
		
		System.out.println("Marca:"+coche1.getMarca()+
				"-Modelo:"+coche1.getModelo());
		
		
		System.out.println("Velocidad:"+coche1.getVelocidad()+"km/h");
		coche1.acelerar();
		coche1.acelerar();
		
		System.out.println("Velocidad:"+coche1.getVelocidad()+"km/h");
		coche1.frenar();
		System.out.println("Velocidad:"+coche1.getVelocidad()+"km/h");

	
		
	}

}
