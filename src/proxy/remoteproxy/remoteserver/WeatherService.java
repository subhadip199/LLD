package proxy.remoteproxy.remoteserver;

public class WeatherService implements Weather {
    @Override
    public String getWeather() {
        // Simulate fetching weather data from a remote server
        return "Weather data : Sunny, 25°C";
    }
}
