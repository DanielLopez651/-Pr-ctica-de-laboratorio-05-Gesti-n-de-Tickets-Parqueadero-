package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.modelo.Cliente;

public class ControladorCliente {

    //modelo
    private Cliente cliente;
    private Vehiculo vehiculo;
    //daos
    private ClienteDAO clienteDAO;
    private VehiculoDAO vehiculoDAO;

    public ControladorCliente(ClienteDAO clienteDAO, VehiculoDAO vehiculoDAO) {
        this.clienteDAO = clienteDAO;
        this.vehiculoDAO = vehiculoDAO;
    }

    public void registrar(String cedula, String nombre, String direccion, String telefono) {

        cliente = new Cliente(cedula, nombre, direccion, telefono);

        clienteDAO.create(cliente);

    }
    public boolean validarCliente(String cedula){
        cliente=clienteDAO.login(cedula);
        if(cliente!=null){
            return true;
        }else{
            return false;
        }
    }

}
