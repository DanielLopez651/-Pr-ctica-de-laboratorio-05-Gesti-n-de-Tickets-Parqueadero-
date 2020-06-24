package ec.edu.ups.dao;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import java.util.List;
import java.util.ArrayList;
public class ClienteDAO implements IClienteDAO{
     private List<Cliente> ListaCliente;
    public ClienteDAO(){
        ListaCliente=new ArrayList<>();
    }
    
    @Override
    public void create(Cliente cliente) {
        ListaCliente.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
       return null;
    }

    @Override
    public void update(Cliente cliente) {
       
    }

    @Override
    public void delete(Cliente cliente) {
       
    }

    @Override
    public List<Cliente> findAll() {
        return ListaCliente;
    }
    
}
