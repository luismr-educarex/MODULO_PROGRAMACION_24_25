package unidades.unidad7.ejemplos.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
	
		String cadena = "91";
		Pattern pattern =  Pattern.compile("[159]");
		Matcher matcher = pattern.matcher(cadena);

		if(matcher.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		String cadena2 = "1Cic5los9";
		Pattern pattern2 =  Pattern.compile("[951]");
		Matcher matcher2 = pattern2.matcher(cadena2);

		if(matcher2.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		String cadena3 = "iooooooooo";
		Pattern pattern3 =  Pattern.compile("^io");
		Matcher matcher3 = pattern3.matcher(cadena3);

		if(matcher3.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		
		String cadena4 = "aa";
		Pattern pattern4 =  Pattern.compile("a{2,4}\\d");
		Matcher matcher4 = pattern4.matcher(cadena4);

		if(matcher4.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		String cadena5 = "Hola   clase";
		Pattern pattern5 =  Pattern.compile("\\w\\s+\\w");
		Matcher matcher5 = pattern5.matcher(cadena5);

		if(matcher5.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
				

	}

}
