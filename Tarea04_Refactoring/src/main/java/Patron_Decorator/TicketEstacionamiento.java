/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Decorator;

/**
 *
 * @author Schic
 */
public class TicketEstacionamiento extends TicketDecorator {
    
    private static final double PRECIO_ESTACIONAMIENTO = 2.5;

    public TicketEstacionamiento(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public double precio() {
        System.out.println("La opcion adicional de estacionamiento cuesta: " + PRECIO_ESTACIONAMIENTO);
        return ticket.precio() + PRECIO_ESTACIONAMIENTO;
    }

    @Override
    public String descripcion() {
        return "A su ticket se a añadido la opcion adicional de estacionamiento";
    }
    
}
