package unidades.unidad9.tareas.transporte;

public class TransporteMercancia extends Viaje{
	
	private double pesoCarga;
	private String tipoCarga;
	

	public TransporteMercancia(String matriculaCamion, String conductor, String origen, String destino,
			double pesoCarga, String tipoCarga) {
		super(matriculaCamion, conductor, origen, destino);
		this.pesoCarga = pesoCarga;
		this.tipoCarga = tipoCarga;
	}

	@Override
	public void mostrarDetalle() {
		System.out.println("Viaje de Mercancia - Camión:"+ matriculaCamion);
		System.out.println("Conductor:"+conductor);
		System.out.println("Origen:"+origen);
		System.out.println("Destino:"+destino);
		System.out.println("Carga:"+pesoCarga);
		System.out.println("Tipo mercancía:"+tipoCarga);
		System.out.println("Coste del viaje:"+ calcularCosteViaje());
		System.out.println("_________________________________________");
	}

	@Override
	public double calcularCosteViaje() {
		
		double costoBase = 50;
		
		double costoPorTonelada =0;
		switch (tipoCarga.toLowerCase()) {
			case "general":
					costoPorTonelada = 10;
					break;
			case "refrigera":
					costoPorTonelada = 15;
					break;
			case "pesada":
					costoPorTonelada = 20;
					break;
		    default:
		    		System.out.println("Tipo no reconocido");
		}
		
		return costoBase + (pesoCarga * costoPorTonelada);
	}

}















