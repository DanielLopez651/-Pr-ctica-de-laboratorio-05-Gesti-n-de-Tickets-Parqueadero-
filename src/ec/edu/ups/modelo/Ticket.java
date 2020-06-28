/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDateTime;





/**
 *
 * @author user
 */
public class Ticket {
    private int numeroT;
    private int horadeEntrada;
    private int minutodeEntrada;
    public Ticket(int numeroT, int horadeEntrada, int minutodeEntrada) {
        this.numeroT = numeroT;
        this.horadeEntrada = horadeEntrada;
        this.minutodeEntrada = minutodeEntrada;
    }
    public int getHoradeEntrada() {
        return horadeEntrada;
    }
    public void setHoradeEntrada(int horadeEntrada) {
        this.horadeEntrada = horadeEntrada;
    }
    public int getMinutodeEntrada() {
        return minutodeEntrada;
    }
    public void setMinutodeEntrada(int minutodeEntrada) {
        this.minutodeEntrada = minutodeEntrada;
    }
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
