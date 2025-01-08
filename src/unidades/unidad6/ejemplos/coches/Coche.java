package unidades.unidad6.ejemplos.coches;

public class Coche {
	
	//atributos (estática)
	private String marca;
	private String modelo;
	private int matriculacion;
	private String color;
	private char tipoMotor; //G=gasolina, D=diesel, E=eléctrico
	private double velocidad;
	private int cv; 
	

	public Coche(String marca,
				 String modelo,
				 int matriculacion,
				 String color,
				 char tipoMotor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.color = color;
		this.tipoMotor = tipoMotor;
		velocidad = 100;
		
		
	}
	
	
	//métodos (dinámica)
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
			this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar() {
		velocidad+=10;
	}
	
	public void frenar() {
		velocidad-=5;
	}

	

}






