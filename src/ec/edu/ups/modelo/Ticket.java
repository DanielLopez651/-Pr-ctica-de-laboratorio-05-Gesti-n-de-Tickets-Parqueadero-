/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author user
 */
public class Ticket {
    private int numeroT;

    public int getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(int numeroT) {
        this.numeroT = numeroT;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numeroT=" + numeroT + '}';
    }

 

    
}
