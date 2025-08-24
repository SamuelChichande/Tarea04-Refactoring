/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Decorator;

/**
 *
 * @author Schic
 */
public class TicketBebida extends TicketDecorator {
    
    private static final double PRECIO_BEBIDA = 1.5;

    public TicketBebida(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public double precio() {
        System.out.println("El acompañamiento con bebida cuesta: " + PRECIO_BEBIDA);
        return ticket.precio() + PRECIO_BEBIDA;
    }

    @Override
    public String descripcion() {
        return "A su ticket se a añadido el acompañamiento de bebida";
    }
    
}