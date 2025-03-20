package unidades.unidad9.tareas.transporte;

public class TransportePeligroso extends Viaje{

	private int nivelRiesgo;
	private String material;
	
	
	
	public TransportePeligroso(String matriculaCamion, String conductor, String origen, String destino, int nivelRiesgo,
			String material) {
		super(matriculaCamion, conductor, origen, destino);
		this.nivelRiesgo = nivelRiesgo;
		this.material = material;
	}

	@Override
	public void mostrarDetalle() {
		System.out.println("Viaje de Mercancia - Camión:"+ matriculaCamion);
		System.out.println("Conductor:"+conductor);
		System.out.println("Origen:"+origen);
		System.out.println("Destino:"+destino);
		System.out.println("Nivel riesgo:"+nivelRiesgo);
		System.out.println("Tipo material:"+material);
		System.out.println("Coste del viaje:"+ calcularCosteViaje());
		System.out.println("_________________________________________");
		
	}

	@Override
	public double calcularCosteViaje() {
		
		double costeBase = 200;
		
		return costeBase + (nivelRiesgo*50);
	}

}






