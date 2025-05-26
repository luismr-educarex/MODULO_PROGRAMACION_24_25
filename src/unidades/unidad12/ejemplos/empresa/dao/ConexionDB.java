package unidades.unidad12.ejemplos.empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que se encarga de obtener la conexión a la base de datos con los parámetros de conexión.
 */
public class ConexionDB {
	
	private static final String URL="jdbc:mysql://localhost:3306/ciclos";
	private static final String USUARIO = "daw";
	private static final String PASS = "admin";
	
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL,USUARIO,PASS);
	}
}






