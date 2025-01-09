package unidades.unidad6.ejemplos.coches;

public class Coche {
	
	//atributos (estática)
	public String marca;
	private String modelo;
	private int matriculacion;
	private String color;
	private Motor motor;
	private double velocidad;
	private Revision[] revisones;
	
	
	public Coche(String marca,String modelo,int matriculacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion=matriculacion;
		this.color = "Sin color asignado";
		this.velocidad = 0;
		this.motor=null;
	}
	public Coche(String marca,
				 String modelo,
				 int matriculacion,
				 String color,
				 Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.color = color;
		this.motor = motor;
		velocidad = 100;
		
		
	}
	
	
	//métodos (dinámica)
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
			
		if(comprobarMarca(marca)) {
			this.marca = marca;
		}
		
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
	
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public Revision[] getRevisones() {
		return revisones;
	}
	public void setRevisones(Revision[] revisones) {
		this.revisones = revisones;
	}
	
	
	
	public void acelerar() {
		
		if(motor.getCv()>=100) {
			velocidad+=20;
		}else {
			velocidad+=10;
		}
		
		
	}
	
	public void frenar() {
		velocidad-=5;
	}
	
	private boolean comprobarMarca(String marca) {
		
		boolean marcaValida = true;
		if(marca.equals("Ford")) {
			marcaValida = false;
		}
		
		return marcaValida;
	}
	
	public void mostrarDatos() {
		

		String datos = "-------- DATOS COCHE ------";
		datos += "\nMarca:"+marca;
		datos += "\nModelo:"+modelo;
		datos += "\nMatriculacion:"+matriculacion;
		datos += "\nColor:"+color;
		datos += "\nVelocidad:"+velocidad;
		datos += "\nMotor_____";
		datos += "\nTipo motor:"+motor.getTipoMotor();
		datos += "\nCilindrada:"+motor.getCilindrada();
		datos += "\nCv:"+motor.getCv();
		datos += "\n----------------------";
		
		System.out.println(datos);
	}
	
	@Override
	public String toString() {
		
		String datos = "-------- DATOS COCHE ------";
		datos += "\nMarca:"+marca;
		datos += "\nModelo:"+modelo;
		datos += "\nMatriculacion:"+matriculacion;
		datos += "\nColor:"+color;
		datos += "\nVelocidad:"+velocidad;
		datos += "\n"+motor.toString();
		datos += "\nRevisiones________";
		for(int i=0;i<revisones.length;i++) {
			if(revisones[i]!=null) {
				datos+="\n"+revisones[i].toString();
			}
		}
		datos += "\n----------------------";
		
		return datos;
	}

	

}






