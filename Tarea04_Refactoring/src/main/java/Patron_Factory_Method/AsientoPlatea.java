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
public class AsientoPlatea extends Asiento {
    
    private static final double PRECIO_PLATEA = 4.5;

    public AsientoPlatea(Usuario reservadoPor, String descripcion) {
        super(PRECIO_PLATEA, reservadoPor, descripcion);
    }
}

