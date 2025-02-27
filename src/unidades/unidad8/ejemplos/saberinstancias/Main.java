package unidades.unidad8.ejemplos.saberinstancias;

public class Main {

	public static void main(String[] args) {
	
	
		System.out.println(IAnimal.ZONA);
		
		Animal miAnimal = new Gato();
		Animal miAnimalFavorito = new Perro();
		Animal animalPeligroso = new Cocodrilo();
		

		Animal animales[] = new Animal[3];
		
		animales[0] = miAnimal;
		animales[1] = miAnimalFavorito;
		animales[2] = animalPeligroso;
		
		
		jugarAnimales(animales);
 		
	

	}

	private static void jugarAnimales(Animal[] animales) {
		
		
		for (Animal animal : animales) {
		
			if(animal instanceof Perro) {
				Perro perro = (Perro) animal;
				perro.hacerSonido();
				perro.moverCola();
				perro.dormir();
				perro.corre();
				perro.saltar();
				perro.fijarPresa();
				perro.perseguirPresa();
				

			}else if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gato.hacerSonido();
				gato.ronronear();
				gato.dormir();
				
			}else {
				System.out.println("Animal no registrado");
			}
		}
		
		
	}

}
