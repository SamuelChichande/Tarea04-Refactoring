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
public class NotificacionSMS implements NotificacionListener {
    private NotificacionManager notificacionManager;
    
    @Override
    public void actualizar() {
        notificacionManager.suscribir(() -> Logger.getLogger(NotificacionSMS.class.getName())
                .info("Notification por SMS"));
    }

}
