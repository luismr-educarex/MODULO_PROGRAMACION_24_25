package unidades.unidad9.tareas.transporte;

public class TransporteAnimales extends Viaje{

	private int numAnimales;
	private String tipoAnimal;
	
	
	
	public TransporteAnimales(String matriculaCamion, String conductor, String origen, String destino, int numAnimales,
			String tipoAnimal) {
		super(matriculaCamion, conductor, origen, destino);
		this.numAnimales = numAnimales;
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public void mostrarDetalle() {
		System.out.println("Viaje de Mercancia - Camión:"+ matriculaCamion);
		System.out.println("Conductor:"+conductor);
		System.out.println("Origen:"+origen);
		System.out.println("Destino:"+destino);
		System.out.println("Número animales:"+numAnimales);
		System.out.println("Tipo animales:"+tipoAnimal);
		System.out.println("Coste del viaje:"+ calcularCosteViaje());
		System.out.println("_________________________________________");
		
	}

	@Override
	public double calcularCosteViaje() {
		double costoBase = 80;
		
		return costoBase + (numAnimales*5);
	}
	
	

}
