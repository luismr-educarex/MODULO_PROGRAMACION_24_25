package unidades.unidad12.ejemplos.empresa.services;


import java.sql.SQLException;
import java.util.List;

import unidades.unidad12.ejemplos.empresa.modelos.Empleado;
import unidades.unidad12.ejemplos.empresa.dao.EmpleadoDAO;

/**
 * Clase de la capa servicios que se encarga de realizar las acciones de negocio del programa. En este caso hace uso de la
 * capa DAO para recuperar o actualizar la información en la base de datos.
 */
public class EmpleadoService {

    private final EmpleadoDAO dao;

    public EmpleadoService() {
        this.dao = new EmpleadoDAO();
    }

    public void insertarEmpleado(Empleado e) throws SQLException {
        if (e.getSalario() < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        dao.insertar(e);
    }

    public List<Empleado> listarEmpleados() throws SQLException {
        return dao.listar();
    }

    public void actualizarEmpleado(Empleado e) throws SQLException {
        if (e.getSalario() < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        dao.actualizar(e);
    }

    public void eliminarEmpleado(int id) throws SQLException {
        dao.delete(id);
    }
}
