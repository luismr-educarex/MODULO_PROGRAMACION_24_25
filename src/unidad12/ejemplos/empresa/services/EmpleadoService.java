package unidad12.ejemplos.empresa.services;

import unidad12.ejemplos.empresa.dao.EmpleadoDAO;

public class EmpleadoService {

	
	private final EmpleadoDAO dao;
		
	public EmpleadoService() {
		this.dao= new EmpleadoDAO();
	}

}
