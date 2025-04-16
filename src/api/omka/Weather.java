package api.omka;

public class Weather {
    private String city;
    private int temperature;
    private String condition;

    public Weather(String city, int temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void displayInfo() {
        System.out.println("Шаар: " + city + ", Температура: " + temperature + "°C, Аба ырайы: " + condition);
    }
}
