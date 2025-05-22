package unidades.unidad11.ejercicios.itv;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		

			LineaInspeccion linea1 =  new LineaInspeccion("Identificación", Resultado.OK, "");
			LineaInspeccion linea2 =  new LineaInspeccion("Alumbrado", Resultado.LEVE, "");
			LineaInspeccion linea3 =  new LineaInspeccion("Dirección", Resultado.OK, "");
			LineaInspeccion linea4 =  new LineaInspeccion("Frenos", Resultado.LEVE, "");
			LineaInspeccion linea5 =  new LineaInspeccion("Neumáticos", Resultado.OK, "");
			LineaInspeccion linea6 =  new LineaInspeccion("Emisiones", Resultado.LEVE, "");
			LineaInspeccion linea7 =  new LineaInspeccion("Seguridad", Resultado.OK, "");
			
			List<LineaInspeccion> lineas = new ArrayList<LineaInspeccion>();
			
			lineas.add(linea1);
			lineas.add(linea2);
			lineas.add(linea3);
			lineas.add(linea4);
			lineas.add(linea5);
			lineas.add(linea6);
			lineas.add(linea7);
			
			Inspeccion inspeccion1 = new Inspeccion(1, lineas);
			
			Inspeccion inspeccion2 = new Inspeccion(2);
			
			
			try {
			inspeccion2.getLineasInspeccion().add(linea1);
			System.out.println("Revisión añadida");
			Thread.sleep(1);
			inspeccion2.getLineasInspeccion().add(linea2);
			Thread.sleep(1);
			System.out.println("Revisión añadida");
			inspeccion2.getLineasInspeccion().add(linea3);
			Thread.sleep(1);
			System.out.println("Revisión añadida");
			inspeccion2.getLineasInspeccion().add(linea4);
			Thread.sleep(1);
			System.out.println("Revisión añadida");
			inspeccion2.getLineasInspeccion().add(linea5);
			Thread.sleep(1);
			System.out.println("Revisión añadida");
			inspeccion2.getLineasInspeccion().add(linea6);
			Thread.sleep(1);
			System.out.println("Revisión añadida");
			inspeccion2.getLineasInspeccion().add(linea7);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
			List<Inspeccion> inspecciones = new ArrayList<Inspeccion>();
			inspecciones.add(inspeccion1);
			inspecciones.add(inspeccion2);
			
			Vehiculo vehiculo1 = new Vehiculo("8767GHD", "Ford", "Fiesta", 13000, inspecciones);
			
			
			
			System.out.println(vehiculo1);
			
		    vehiculo1.mostrarDatos();
			
			
			
			
		
		
	}

}
