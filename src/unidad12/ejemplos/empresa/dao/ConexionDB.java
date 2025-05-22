package unidad12.ejemplos.empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	private static final String URL="jdbc:mysql://192.168.50.61:3306/ciclos";
	private static final String USUARIO = "daw";
	private static final String PASS = "admin";
	
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL,USUARIO,PASS);
	}
}






