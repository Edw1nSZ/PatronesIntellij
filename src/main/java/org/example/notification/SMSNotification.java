package org.example.notification;

public class SMSNotification implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje Enviandose: "+mensaje);
    }
}
