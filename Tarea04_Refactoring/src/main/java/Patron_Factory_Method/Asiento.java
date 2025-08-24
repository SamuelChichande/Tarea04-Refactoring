/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Factory_Method;

import Clases.Usuario;

/**
 *
 * @author Schic
 */
public abstract class Asiento {
    protected Usuario reservadoPor;
    protected double precio;
    protected String descripcion;

    public Asiento(double precio, Usuario reservadoPor, String descripcion) {
        if (reservadoPor == null || descripcion == null) { 
            throw new IllegalArgumentException("Datos inválidos"); 
        }
        this.precio = precio;
        this.reservadoPor = reservadoPor;
        this.descripcion = descripcion;
    }

    public Usuario getReservadoPor() {
        return reservadoPor;
    }

    public boolean estaReservado() {
        return reservadoPor != null;
    }

    public void setReservadoPor(Usuario reservadoPor) {
        this.reservadoPor = reservadoPor;
    }


}
