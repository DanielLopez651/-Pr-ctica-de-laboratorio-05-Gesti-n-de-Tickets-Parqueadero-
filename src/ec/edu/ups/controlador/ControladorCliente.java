package ec.edu.ups.controlador;
import ec.edu.ups.dao.*;

import ec.edu.ups.modelo.Cliente;
public class ControladorCliente {
    private ClienteDAO clienteDao;
    private VehiculoDAO vehiculoDao;
    private Cliente cliente;

    public ControladorCliente(ClienteDAO clienteDao, VehiculoDAO vehiculoDao) {
        this.clienteDao = clienteDao;
        this.vehiculoDao = vehiculoDao;
    }

    
    
    
}
