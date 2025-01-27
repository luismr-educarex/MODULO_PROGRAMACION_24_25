package unidades.unidad7.ejemplos.cadenas;

public class CadenasConString {

	public static void main(String[] args) {
		
		String cadena = "Más vale pájaro en mano que ciento volando";
		String texto = new String("Allí donde fueres, haz lo que vieres");

		System.out.println(cadena);
		
		System.out.println("Lontigud:"+cadena.length());
		System.out.println("Carácter en la posición 1:"+cadena.charAt(1));
		
		System.out.println("Subcadena:"+cadena.substring(9, 15));
		
		
		String nombre =" Luis ";
		String apellido1 = "Martínez";
		String apellido2 = "Redondo";
		
		System.out.println("Nombre:"+nombre.toUpperCase());
		System.out.println("Nombre:"+nombre.toLowerCase());

		
		String apellidoSinTildes = apellido1.replace('á', 'a')
				                            .replace('é', 'e')
				                            .replace('í', 'i')
				                            .replace('ó', 'o')
				                            .replace('ú', 'u');
		
		
		
		String usuario = nombre.toLowerCase().substring(0, 1)
							+apellidoSinTildes.toLowerCase()
							+apellido2.toLowerCase().substring(0, 1);
		
		System.out.println("Usuario:"+usuario);
		
		String nombreLimpio = nombre.trim();
		System.out.println("Nombre limpio:"+nombreLimpio);
			
		String MAC = "FF:4C:11:56:A3:B1";
		
		String []elementosMac = MAC.split(":");
		
		for(int i=0;i<elementosMac.length;i++)
		{
			System.out.println(elementosMac[i]);
		}
		
	

	}

}
