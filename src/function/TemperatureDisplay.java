package function;

import interfaces.Observer;

public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("La temperatura actual es: " + temperature + " grados.");
    }
}
