package proxy.remoteproxy.localserver;

import proxy.remoteproxy.remoteserver.Weather;

public class Main {
    static void main() {
        Weather weather = new WeatherProxy();
        System.out.println(weather.getWeather());

    }
}
