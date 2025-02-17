package unidades.unidad8.ejemplos.fauna;

public class Perro extends Mamifero{

	private String raza;
	
	public Perro(String nombre, int edad, int numPatas,String raza) {
		super(nombre, edad, numPatas);
		this.raza=raza;
		
	}
	
	public void ladrar() {
		
		System.out.println("Guau guau");
	}
	
	public void comer() {
		super.comer();
		System.out.println("lñaksjdflsajfsañfj");
	}
	
	public void comer(String pienso) {
		System.out.println("lñaksjdflsajfsañfj "+pienso);
	}
	
	public void comer(int cantidad) {
		System.out.println("lñaksjdflsajfsañfj "+cantidad);
	}
	
	public void comer(int cantidad,String pienso) {
		System.out.println("lñaksjdflsajfsañfj "+cantidad+" "+pienso);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
	

}
