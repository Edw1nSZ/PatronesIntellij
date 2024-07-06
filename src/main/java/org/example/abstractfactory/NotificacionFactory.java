package org.example.abstractfactory;

import org.example.notification.*;

public interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotification crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
}
