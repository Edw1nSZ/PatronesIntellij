package org.example.notification;

public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Mensaje a la Aplicacion, Por favor sea paciente \n"+mensaje);
    }
}
