package unidades.unidad8.ejercicios.vehiculosE;

public class VehiculoElectrico {

	protected String marca;
	protected String modelo;
	protected int capacidadMax;
	protected int autonomiaMax;
	
	public VehiculoElectrico(String marca, String modelo, int capacidadMax, int autonomiaMaxi) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadMax = capacidadMax;
		this.autonomiaMax = autonomiaMaxi;
	}
	
	public double calcularAutonomiaReal(double velocidad,String terreno) {
		
		System.out.println("Calculando...");
		
		return 0;
	}
	
	
}
