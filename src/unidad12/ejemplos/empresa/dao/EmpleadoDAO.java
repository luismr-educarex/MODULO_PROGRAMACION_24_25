package unidad12.ejemplos.empresa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import unidad12.ejemplos.empresa.modelos.Empleado;

public class EmpleadoDAO {
	
	public List<Empleado> listar() throws SQLException{
		
		List<Empleado> lista = new ArrayList<Empleado>();
		String sql = "SELECT * FROM empleados";
		
		try(
			Connection con = ConexionDB.conectar();	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);		
			)
		    {
			  while(rs.next()) {
				  Empleado empleado = new Empleado(
						  rs.getInt("id"),
						  rs.getString("nombre"),
						  rs.getString("puesto"),
						  rs.getDouble("salario")
						  
						  );
				  lista.add(empleado);
			  }
				
				
			}
		
		return lista;
	}
	
	public void delete(int id) throws SQLException{
		
		String sql = "DELETE FROM empleados WHERE id=?";
	
		try(
				Connection con = ConexionDB.conectar();	
				PreparedStatement stmt = con.prepareStatement(sql);			
				){
					stmt.setInt(1, id);
					stmt.executeUpdate();
				}
	}
	
	
	public void insertar(Empleado empleado) throws SQLException{
			
		String sql = "INSERT INTO empleados(nombre,puesto,salario) VALUES (?,?,?)";
	
		try(
				Connection con = ConexionDB.conectar();	
				PreparedStatement stmt = con.prepareStatement(sql);			
				){
					stmt.setString(1, empleado.getNombre());
					stmt.setString(2, empleado.getPuesto());
					stmt.setDouble(3, empleado.getSalario());
					stmt.executeUpdate();
				}
	}
	
	
	public void actualizar(Empleado empleado) throws SQLException{
		
		String sql = "UPDATE empleados SET nombre=?,puesto=?,salario=? WHERE id=?";
	
		try(
				Connection con = ConexionDB.conectar();	
				PreparedStatement stmt = con.prepareStatement(sql);			
				){
					stmt.setString(1, empleado.getNombre());
					stmt.setString(2, empleado.getPuesto());
					stmt.setDouble(3, empleado.getSalario());
					stmt.setInt(4, empleado.getId());
					stmt.executeUpdate();
				}
	}
	
	
	public List<Empleado> buscarPorNombre(String nombre) throws SQLException{
		
		List<Empleado> lista = new ArrayList<Empleado>();
		String sql = "SELECT * FROM empleados WHERE nombre="+nombre;
		
		try(
			Connection con = ConexionDB.conectar();	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);		
			)
		    {
			  while(rs.next()) {
				  Empleado empleado = new Empleado(
						  rs.getInt("id"),
						  rs.getString("nombre"),
						  rs.getString("puesto"),
						  rs.getDouble("salario")
						  
						  );
				  lista.add(empleado);
			  }
				
				
			}
		
		return lista;
	}

}









