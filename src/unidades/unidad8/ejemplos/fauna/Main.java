package unidades.unidad8.ejemplos.fauna;

public class Main {

	public static void main(String[] args) {
		
		
		Animal miPerro = new Perro("String", 5,4 , "Pastor Alemán");
		Gato miGato = new Gato("Ciro", 7,4 , "Blanco");
		Tiburon miTiburon = new Tiburon("Blue", 34, "Salada", 84);
		Gallina miGallina = new Gallina("Lola",5,true,true);
		
		darDeComer(miPerro);
		darDeComer(miGato);
		darDeComer(miTiburon);
		darDeComer(miGallina);
		
		((Perro)miPerro).ladrar();
		
		
	}
	
	private static void darDeComer(Animal animal) {
		
		animal.comer();
	}

}
