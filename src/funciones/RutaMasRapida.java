package funciones;

import Interfaces.RutaStrategy;

public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más rápida entre "+puntoA+" y "+puntoB;
    }
}
