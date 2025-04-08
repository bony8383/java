package variable.urmat;

public class DataTypesEx {
    public static void main(String[] args) {
        String firstName = "Urmatbek";
        String lastName = "Dubanaev";
        int age = 37;
        double height = 180.0;
        boolean country = true;

        System.out.println("Hi, I'm " + firstName + " " + lastName + ".");
        System.out.println("I'm " + age + ". " + "My height is " + height + " m.");
        System.out.println("Are they from Bishkek? " + country);

        System.out.println("------------------------------");

        System.out.println(Byte.MAX_VALUE + "   Целые числа 8 бит (1 байт) информации");
        System.out.println(Short.MAX_VALUE + "   Целые числа 16 бит (2 байта) информации");
        System.out.println(Integer.MAX_VALUE + "   Целые числа 32 бит (4 байта) информации");
        System.out.println(Long.MAX_VALUE + "   Целые числа 64 бит (8 байт) информации");
        System.out.println(Float.MAX_VALUE + "   Значения с плавающей точкой 32 бит (4 байта)");
        System.out.println(Double.MAX_VALUE + "   Значения с плавающей точкой 64 бит (8 байт)");

        System.out.println("------------------------------");

        byte whatches = 5;
        System.out.println("У меня " + whatches + " наручные часы.");
        short boxes = 100;
        System.out.println("МЫ купили " + boxes + " коробок шоколаду.");
        int crowd = 100000;
        System.out.println("Собралось " + crowd + " человек.");
        long money = 3000000;
        System.out.println("Перевели " + money + " сомов.");

    }
}
