package unidades.unidad6.ejemplos.coches;

public class Coche {
	
	//atributos (estática)
	public String marca;
	private String modelo;
	private int matriculacion;
	private String color;
	private Motor motor;
	private double velocidad;
	private Revision[] revisiones;
	
	
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
		return revisiones;
	}
	public void setRevisones(Revision[] revisones) {
		this.revisiones = revisones;
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
		for(int i=0;i<revisiones.length;i++) {
			if(revisiones[i]!=null) {
				datos+="\n"+revisiones[i].toString();
			}
		}
		datos += "\n----------------------";
		
		return datos;
	}
	
	public void addRevision(Revision revision) {
		
		 int posicion = obtenerPosionLibre();
		 
		 if(posicion!=-1) { // hay una posición libre
			 revisiones[posicion]=revision;
		 }else {
			 System.out.println("Ha superado el límite de revisiones");
		 }
		 
	}
	
	private int obtenerPosionLibre() {
		int posicion= -1;
		for(int i=0;posicion==-1 && i<revisiones.length;i++) {
			if(revisiones[i]==null) {
				posicion=i;
			}
		}
		return posicion;
	}
	
	public Revision obtenerRevisionPorId(int idRevision) {
		
		Revision revision = null;
		for(int i=0;revision==null && i<revisiones.length;i++) {
			if(revisiones[i]!=null) {
				if(revisiones[i].getId()==idRevision) { // Se ha encontrado la revisión
					revision = revisiones[i];
				}
			}
		}
		return revision;
	}
	
	public Revision obtenerRevisionPorId2(int idRevision) {
		
		boolean encontrado=false;
		Revision revision = null;
		
		int i=0;
		while(!encontrado || i<revisiones.length) {
			if(revisiones[i]!=null) {
				if(revisiones[i].getId()==idRevision) {
					revision=revisiones[i];
					encontrado=true;
				}
			}
		}
	
		return revision;
	}


	

}






