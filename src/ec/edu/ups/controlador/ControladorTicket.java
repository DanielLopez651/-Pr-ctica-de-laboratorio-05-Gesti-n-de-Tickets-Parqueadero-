package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import java.util.List;

public class ControladorTicket {

    private TicketDAO ticketDAO;
    private VehiculoDAO vehiculoDAO;
    public ControladorTicket(VehiculoDAO vehiculoDAO,TicketDAO ticketDAO){
         this.ticketDAO=ticketDAO;
            this.vehiculoDAO = vehiculoDAO;
    }
    public void crearTicket(Ticket ticket){
        ticketDAO.create(ticket);
        
    }
public Ticket buscarTicketPorCodigo(int codigo){
    
    List<Ticket> ticket=ticketDAO.findAll();
    System.out.println(ticket.size());
    for (Ticket ticket1 : ticket) {
       
      
        if(ticket1.getNumeroT()==codigo){
            return ticket1;
        }
    }
    return null;
}

    
}
