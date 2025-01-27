package unidades.unidad7.ejemplos.cadenas;

public class CadenaConStringBuffer {

	public static void main(String[] args) {
		
		String ciclo = "Desarrollo de aplicaciones";
		ciclo = ciclo + " web";
	
		StringBuffer sbf = new StringBuffer();
		sbf.append("Desarrollo aplicaciones en");
		sbf.append(" web");
		sbf.insert(11, "de ");
		sbf.delete(27, 30);
	
		StringBuilder sbd = new StringBuilder("Desarrollo de aplicaciones multiplataforma");
		sbd.append("-DAM");

		System.out.println(ciclo);
		System.out.println(sbf);
		System.out.println(sbf.reverse());
		System.out.println(sbd);
		
		
		System.out.println("Longitud:"+sbf.length());
		System.out.println("Longitud:"+sbd.length());
		
	
		System.out.println("Capacidad:"+sbf.capacity());
		System.out.println("Capacidad:"+sbd.capacity());
		
		
		
	}

}
