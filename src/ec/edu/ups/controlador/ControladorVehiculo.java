/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import com.sun.imageio.plugins.jpeg.JPEG;
import ec.edu.ups.idao.IVehichuloDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.*;
import ec.edu.ups.controlador.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

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
       
            
        vehiculo=new Vehiculo(placa, marca, modelo);
        
        vehichuloDAO.create(vehiculo);

    }
    
    public Vehiculo BuscarVehiculoPorPlaca (String placa){
        
        List <Vehiculo> listaVehiculo= vehichuloDAO.findAll();
        
        for (Vehiculo vehiculo1 : listaVehiculo) {
            if ( vehiculo1.getPlaca().equalsIgnoreCase(placa)){
                vehiculo1.setTickete(ticket);
                vehichuloDAO.update(vehiculo1);
                return vehiculo1;
            }
        }
        return null;
    }
        
}
