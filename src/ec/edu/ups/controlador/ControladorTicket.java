package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.dao.TicketDAO;
import java.util.List;

public class ControladorTicket {

    TicketDAO ticketDao;
    
    public ControladorTicket(){
        ticketDao=new TicketDAO();
    }
    public void crearTicket(Ticket ticket){
        ticketDao.create(ticket);
        
    }
public Ticket buscarTicketPorCodigo(int codigo){
    
    List<Ticket> ticket=ticketDao.findAll();
    System.out.println(ticket.size());
    for (Ticket ticket1 : ticket) {
       
      
        if(ticket1.getNumeroT()==codigo){
            return ticket1;
        }
    }
    return null;
}
    
}
