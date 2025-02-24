package unidades.unidad8.ejercicios.vehiculosE;

public class CocheElectrico extends VehiculoElectrico{

	private int numRuedas;
	private int tipoCarga;
	
	public CocheElectrico(String marca, String modelo, int capacidadMax, int autonomiaMaxi, int numRuedas,
			int tipoCarga) {
		super(marca, modelo, capacidadMax, autonomiaMaxi);
		this.numRuedas = numRuedas;
		this.tipoCarga = tipoCarga;
	}
	
	@Override
	public double calcularAutonomiaReal(double velocidad, String terreno) {
		
		super.calcularAutonomiaReal(velocidad, terreno);
		
		double autonomia = autonomiaMax;
		
		if(velocidad>120 && terreno.equals("Subida")) {
			autonomia-=30;
		}
		if(velocidad==120 && terreno.equals("Subida")) {
			autonomia-=20;
		}
		if(velocidad<120 && terreno.equals("Subida")) {
			autonomia-=10;
		}
		
		return autonomia;
		
	}
	
	
	
	
}
