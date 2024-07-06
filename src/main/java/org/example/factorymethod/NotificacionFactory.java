package org.example.factorymethod;

import org.example.notification.Notificacion;
import org.example.notification.AppNotificacion;
import org.example.notification.EmailNotificacion;
import org.example.notification.SMSNotification;

public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        if ("EMAIL".equalsIgnoreCase(tipo)) {
            return new EmailNotificacion();
        } else if ("SMS".equalsIgnoreCase(tipo)) {
            return new SMSNotification();
        } else if ("APP".equalsIgnoreCase(tipo)) {
            return new AppNotificacion();
        }
        return null;
    }
}
