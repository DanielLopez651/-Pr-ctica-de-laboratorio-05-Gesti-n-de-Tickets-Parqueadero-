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
//    private int numeroT;
//    private int horadeEntrada;
//    private int minutodeEntrada;
//    public Ticket(int numeroT, int horadeEntrada, int minutodeEntrada) {
//        this.numeroT = numeroT;
//        this.horadeEntrada = horadeEntrada;
//        this.minutodeEntrada = minutodeEntrada;
//    }
//    public int getHoradeEntrada() {
//        return horadeEntrada;
//    }
//    public void setHoradeEntrada(int horadeEntrada) {
//        this.horadeEntrada = horadeEntrada;
//    }
//    public int getMinutodeEntrada() {
//        return minutodeEntrada;
//    }
//    public void setMinutodeEntrada(int minutodeEntrada) {
//        this.minutodeEntrada = minutodeEntrada;
//    }
//    public int getNumeroT() {
//        return numeroT;
//    }
//    public void setNumeroT(int numeroT) {
//        this.numeroT = numeroT;
//    }
//    @Override
//    public String toString() {
//        return "Ticket{" + "numeroT=" + numeroT + '}';
//    }
 private int numero;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;
    private double total;
    private Vehiculo vehiculo;

    public Ticket() {
    }

    public Ticket(int numero, LocalDateTime fechaIngreso, LocalDateTime fechaSalida, double total, Vehiculo vehiculo) {
	this.numero = numero;
	this.fechaIngreso = fechaIngreso;
	this.fechaSalida = fechaSalida;
	this.total = total;
	this.vehiculo = vehiculo;
    }

    public int getNumero() {
	return numero;
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    public LocalDateTime getFechaIngreso() {
	return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
	return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
	this.fechaSalida = fechaSalida;
    }

    public double getTotal() {
	return total;
    }

    public void setTotal(double total) {
	this.total = total;
    }

    public Vehiculo getVehiculo() {
	return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
	this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
	return "Ticket{" + "numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", total=" + total + ", vehiculo=" + vehiculo + '}';
    }
 

    
}
