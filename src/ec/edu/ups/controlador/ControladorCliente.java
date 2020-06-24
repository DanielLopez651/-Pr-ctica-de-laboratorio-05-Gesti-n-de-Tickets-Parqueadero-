package ec.edu.ups.controlador;
import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.Vehiculo;
import ec.edu.ups.modelo.Cliente;
public class ControladorCliente {
    private ClienteDAO clienteDao;
    private VehiculoDAO vehiculoDao;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public ControladorCliente(ClienteDAO clienteDao, VehiculoDAO vehiculoDao) {
        this.clienteDao = clienteDao;
        this.vehiculoDao = vehiculoDao;
    }
    public void registrar(String cedula, String nombre, String direccion, String telefono ){
        
        
        cliente= new Cliente(cedula, nombre, direccion, telefono);
        
        clienteDao.create(cliente);
        
    }

    
    
    
}
