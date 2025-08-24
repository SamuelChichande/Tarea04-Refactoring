/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Decorator;

/**
 *
 * @author Schic
 */
public class TicketSeguro extends TicketDecorator {
    
    private static final double PRECIO_SEGURO = 1.0;

    public TicketSeguro(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public double precio() {
        System.out.println("La opcion adicional de seguro cuesta: " + PRECIO_SEGURO);
        return ticket.precio() + PRECIO_SEGURO;
    }

    @Override
    public String descripcion() {
        return "A su ticket se le ha añadido la opcion adicional de seguro";
    }
    
}