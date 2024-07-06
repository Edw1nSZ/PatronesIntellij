package org.example.abstractfactory;

import org.example.notification.*;

public class RegularNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotification crearSMSNotificacion() {
        return new SMSNotification();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}
