/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IVehichuloDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author user
 */
public class ControladorVehiculo {
    //Objeto Telefono

    private Vehiculo vehiculo;
    private Cliente cliente;
    //Objetos DAO

    private IVehichuloDAO vehichuloDAO;

    public ControladorVehiculo() {
    }

    public ControladorVehiculo(IVehichuloDAO vehichuloDAO) {
        this.vehichuloDAO = vehichuloDAO;
    }
        
}
