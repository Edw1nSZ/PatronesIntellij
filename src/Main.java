import function.TemperatureDisplay;
import function.WeatherStation;
import function.WeatherWarning;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Llamar a los Observers
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        // Puedes cambiarle los valores y probar si este pasa
        //el maximo de temperatura establecido el cual es 30 grados
        weatherStation.setTemperature(20);
        weatherStation.setTemperature(40);
    }
}