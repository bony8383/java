package api.omka;

public class Main {
    public static void main(String[] args) {
        WeatherService service = new WeatherService();
        Weather bishkekWeather = service.getWeather("Bishkek");
        Weather oshWeather = service.getWeather("Osh");
        bishkekWeather.displayInfo();
        oshWeather.displayInfo();
        // Башка шаар менен
        Weather londonWeather = service.getWeather("London");
        londonWeather.displayInfo();
    }
}
//