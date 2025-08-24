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
public class AsientoBalcon extends Asiento {
    
    private static final double PRECIO_BALCON = 4.0;

    public AsientoBalcon(Usuario reservadoPor, String descripcion) {
        super(PRECIO_BALCON, reservadoPor, descripcion);
    }

}
