package unidades.unidad8.ejemplos.saberinstancias;

public class Gato extends Animal implements Jugar,Cazar{
	
	@Override
	public
	void hacerSonido() {
		System.out.println("El gato maulla:¡Miuau!");
	}
	
	@Override
	public
	void dormir() {
		super.dormir();
		System.out.println();
	}
	
	void ronronear() {
		
		System.out.println("El gato ronroneando...");
	}

	@Override
	public void perseguirPresa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fijarPresa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void corre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}

}
