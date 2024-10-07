package unidades.unidad2.ejercicios;

public class LuzSolar {

	public static void main(String[] args) {
	
		long kmDesdeSol = 150000000;
		long velocidadLuz = 299792458;  // metros por segundo
		
		//Convertir la ditancia en metros
		long mDesdeSol = kmDesdeSol *1000;
		
		long segundos = mDesdeSol/velocidadLuz;
		
		System.out.print("La luz tardará ");
		
		long min = segundos/60;
		segundos = segundos-(min*60);
		
		System.out.print(min+ "minuto(s) y "+ segundos +" segundos(s)");
		System.out.println(" en viajar desde el sol a la Tierra");
				

	}

}
