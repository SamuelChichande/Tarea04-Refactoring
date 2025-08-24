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
public class AsientoVIP extends Asiento {
    
    private static final double PRECIO_VIP = 6.0;

    public AsientoVIP(Usuario reservadoPor, String descripcion) {
        super(PRECIO_VIP, reservadoPor, descripcion);
    }

}
