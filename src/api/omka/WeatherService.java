package api.omka;

public class WeatherService {
    public Weather getWeather(String city) {

        if (city.equalsIgnoreCase("Bishkek")) {
            return new Weather("Bishkek", 18, "Күндүү");
        } else if (city.equalsIgnoreCase("Osh")) {
            return new Weather("Osh", 22, "Булуттуу");
        } else {
            return new Weather(city, 15, "Белгисиз аба ырайы");
        }
    }
}
