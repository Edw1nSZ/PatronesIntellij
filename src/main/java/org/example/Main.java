package org.example;

import org.example.factorymethod.NotificacionFactory;
import org.example.notification.Notificacion;
import org.example.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        // Factory Method
        NotificacionFactory factoryMethod = new NotificacionFactory();
        Notificacion notificacionEmail = factoryMethod.crearNotificacion("EMAIL");
        notificacionEmail.enviarMensaje("Prueba metodo Factory");

        // Abstract Factory
        NotificacionFactory factoryUrgente = new NotificacionFactory();
        Notificacion notificacionSMSUrgente = factoryUrgente.crearNotificacion("SMS");
        notificacionSMSUrgente.enviarMensaje("Metodo factory abstracto(modo Urgente)");

        NotificacionFactory factoryRegular = new NotificacionFactory();
        Notificacion notificacionAppRegular = factoryRegular.crearNotificacion("Notificación");
        if (notificacionAppRegular != null) {
            notificacionAppRegular.enviarMensaje("Hola desde Abstract Factory (Regular)!");
        }}
}