/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IVehichuloDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.*;
import ec.edu.ups.controlador.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class ControladorVehiculo {
    //Objeto Telefono

    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numeroVehiculos=0;
    private Ticket ticket;
    private ControladorTicket controladorTicket;
    //Objetos DAO

    private IVehichuloDAO vehichuloDAO;
   
 

    public ControladorVehiculo(IVehichuloDAO vehichuloDAO,ControladorTicket controladorTicket) {
        this.vehichuloDAO = vehichuloDAO;
       this.controladorTicket=controladorTicket;
    }
    
    public void registrar(String placa,String marca,String modelo){
      
        
       Calendar calendario=new GregorianCalendar();
            int hora,minutos;
            
            
            hora=calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            numeroVehiculos++;
            ticket = new  Ticket(hora,minutos,numeroVehiculos);
           
         
            
        vehiculo=new Vehiculo(placa, marca, modelo,ticket);
        
        vehichuloDAO.create(vehiculo);
//         controladorTicket.crearTicket(ticket);
System.out.println(vehiculo);
    }
        
}
