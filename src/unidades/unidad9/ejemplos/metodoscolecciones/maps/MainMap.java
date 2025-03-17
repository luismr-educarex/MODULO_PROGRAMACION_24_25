package unidades.unidad9.ejemplos.metodoscolecciones.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainMap {

	public static void main(String[] args) {
	
		
		HashMap<String,Double> cuentas = new HashMap<String, Double>();
		
		cuentas.put("Juan",345.45);
		cuentas.put("Ana",123.22);
		cuentas.put("Tomás",12345.89);
		cuentas.put("Ramiro",99.9);
		cuentas.put("Carlos",-12.76);
		
		if(cuentas.containsKey("Ana")) {
			System.out.println("Contiene datos de Ana");
			System.out.println(cuentas.get("Ana"));
		}
		if(cuentas.containsValue(99.9)) {
			System.out.println("Contiene el valor 99.9");
		}
		
		//Obtener un conjunto con las entradas del mapa
		Set<Map.Entry<String,Double>> conjunto = cuentas.entrySet();
		
		for(var elemento:conjunto) {
			System.out.println(elemento.getKey()+":"+elemento.getValue());
		}
		
		for(String clave:cuentas.keySet()) {
			System.out.println("Clave:"+clave);
		}
		
		for(Double valor:cuentas.values()) {
			System.out.println(valor);
		}
	
		
		double saldo = cuentas.get("Carlos");
		cuentas.put("Carlos", saldo+1000);
		
		System.out.println("Nuevo saldo de Carlos:"+cuentas.get("Carlos"));
		

	}

}






