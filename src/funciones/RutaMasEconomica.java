package funciones;

import Interfaces.RutaStrategy;

public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más económica entre "+puntoA+" y "+puntoB;
    }
}
