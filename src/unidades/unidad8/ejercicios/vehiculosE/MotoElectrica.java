package unidades.unidad8.ejercicios.vehiculosE;

public class MotoElectrica extends VehiculoElectrico{
	
	private int cilindrada;
	private boolean tieneSidecar;
	
	public MotoElectrica(String marca, String modelo, int capacidadMax, int autonomiaMaxi, int cilindrada,
			boolean tieneSidecar) {
		super(marca, modelo, capacidadMax, autonomiaMaxi);
		this.cilindrada = cilindrada;
		this.tieneSidecar = tieneSidecar;
	}
	
	@Override
	public double calcularAutonomiaReal(double velocidad, String terreno) {
		
		super.calcularAutonomiaReal(velocidad, terreno);
		
		double autonomia = autonomiaMax;
		
		if(velocidad>120 && terreno.equals("Subida")) {
			autonomia-=40;
		}
		if(velocidad==120 && terreno.equals("Subida")) {
			autonomia-=10;
		}
		if(velocidad<120 && terreno.equals("Subida")) {
			autonomia-=5;
		}
		
		return autonomia;
		
	}

}
