package unidades.unidad11.ejemplos.json;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LeerEmpleadosJson {

	public static void main(String[] args) {
	
		Gson gson = new Gson();
		Type empleadoLista =
				new TypeToken<List<Empleado>>(){}.getType();
				
		try(FileReader lector = new FileReader("empleados.json")){
			
			List<Empleado> empleados = 
					       gson.fromJson(lector,empleadoLista);
			
			for(Empleado empleado:empleados) {
				System.out.println(empleado);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}









