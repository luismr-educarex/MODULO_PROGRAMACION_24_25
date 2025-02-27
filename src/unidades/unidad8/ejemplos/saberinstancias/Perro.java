package unidades.unidad8.ejemplos.saberinstancias;

public class Perro extends Animal implements Jugar,Cazar{

	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra:¡Guau guau!");
	}
	
	void moverCola() {
		
		System.out.println("El perro mueve la colita...");
	}

	@Override
	public void corre() {
		System.out.println("@ @@ @ @ @@ @");
		
	}

	@Override
	public void saltar() {
		System.out.println("@    @    @@    @   @    @@");
		
	}

	@Override
	public void perseguirPresa() {
	
		System.out.println("@@@@@@@@@@ @@@@@@@@@@");
		
	}

	@Override
	public void fijarPresa() {
		
		System.out.println("@ @ @ @");
	}
	
}
