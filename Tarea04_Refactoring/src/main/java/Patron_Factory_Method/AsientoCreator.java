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
public abstract class AsientoCreator {
    protected Asiento asiento;

    public AsientoCreator(Asiento asiento) {
        this.asiento = asiento;
    }

    public abstract Asiento crearAsiento(Usuario usuario, String descripcion);

    public Asiento vender(Usuario usuario) {
        Asiento a = asiento;
        a.setReservadoPor(usuario);
        System.out.println("El asiento ha sido vendido a: " + usuario.getNombre());
        return a;
    };

}
