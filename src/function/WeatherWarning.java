package function;

import interfaces.Observer;

public class WeatherWarning implements Observer {
    private static final int THRESHOLD = 30;

    @Override
    public void update(int temperature) {
        if (temperature > THRESHOLD) {
            System.out.println("WARNING: La temperatura ha superado los " + THRESHOLD + " grados");
        }
    }
}
