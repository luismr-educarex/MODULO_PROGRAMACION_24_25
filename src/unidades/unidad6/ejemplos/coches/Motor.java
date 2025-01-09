package unidades.unidad6.ejemplos.coches;

public class Motor {
	
	private char tipoMotor;
	private int cv;
	private int cilindrada;
	
	public Motor(char tipoMotor,int cv,int cilindrada) {
		
		this.tipoMotor = tipoMotor;
		this.cv = cv;
		this.cilindrada = cilindrada;
		
	}
		
	public char getTipoMotor() {
		return tipoMotor;
	}
	public int getCv() {
		return this.cv;
	}
	public int getCilindrada() {
		return this.cilindrada;
	}

	@Override
	public String toString() {
		return "Motor [tipoMotor=" + tipoMotor + ", cv=" + cv + ", cilindrada=" + cilindrada + "]";
	}
	
	
	

}
