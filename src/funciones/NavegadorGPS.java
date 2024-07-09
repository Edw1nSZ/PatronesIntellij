package funciones;

import Interfaces.RutaStrategy;

public class NavegadorGPS {
    private RutaStrategy strategy;

    public NavegadorGPS(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB) {
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }
}
