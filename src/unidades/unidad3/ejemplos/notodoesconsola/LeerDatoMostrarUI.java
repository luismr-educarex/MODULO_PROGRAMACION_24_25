package unidades.unidad3.ejemplos.notodoesconsola;

import javax.swing.JOptionPane;

public class LeerDatoMostrarUI {

	public static void main(String[] args) {
		
		
		String datoEdad = JOptionPane.showInputDialog("Edad");
		double edad = Double.parseDouble(datoEdad);
		
		
		System.out.println("Edad:"+edad);
		JOptionPane.showMessageDialog(null, datoEdad);
		

	}

}
