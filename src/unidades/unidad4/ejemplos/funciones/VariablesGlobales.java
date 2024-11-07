package unidades.unidad4.ejemplos.funciones;

public class VariablesGlobales {
	
	static int contador = 0;

	public static void main(String[] args) {
		
		incrementar();
		incrementar();
		mostrarContador();
		decrementar();
		mostrarContador();
		incrementar();
		incrementar();
		incrementar();
		mostrarContador();
		decrementar();
		mostrarContador();
	}
	
	static void incrementar() {
		
		contador++;
	}
	
	static void decrementar() {
		
		contador--;
	}
	
	static void mostrarContador() {
		System.out.println("Valor:"+contador);
	}

}
