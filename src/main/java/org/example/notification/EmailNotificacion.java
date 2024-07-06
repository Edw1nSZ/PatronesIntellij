package org.example.notification;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email enviandose: "+mensaje);
    }
}
