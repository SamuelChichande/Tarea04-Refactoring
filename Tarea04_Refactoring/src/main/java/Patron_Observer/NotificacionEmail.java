/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Observer;

import java.util.logging.Logger;

/**
 *
 * @author Schic
 */
public class NotificacionEmail implements NotificacionListener {
    private NotificacionManager notificacionManager;
    
    @Override
    public void actualizar() {
        notificacionManager.suscribir(() -> Logger.getLogger(NotificacionEmail.class.getName())
                .info("Notification por Email"));
    }

}
