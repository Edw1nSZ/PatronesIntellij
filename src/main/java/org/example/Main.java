package org.example;

import org.example.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://ApiLocal.com");
        // TODO: Utiliza más propiedades de la configuración aquí
        //pruebas de otras funciones como si fuera un servidor
        System.out.println("\nURL del Servidor: " + config.getServerUrl());
        System.out.println("\nPuerto: " + config.getPort());
        System.out.println("\nURL de la Base de Datos: " + config.getDatabaseUrl());
        System.out.println("Ha sido conectado Correctamente!!");

    }
}