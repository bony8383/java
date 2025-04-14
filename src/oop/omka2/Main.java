package oop.omka2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setYear(2015);
        car1.setMileage(50000);
        car1.startEngine();
        car1.drive(150);
        car1.displayInfo();
        car1.stopEngine();

        System.out.println();

        // Параметр менен конструктор
        Car car2 = new Car("Honda", 2018, 30000);
        car2.startEngine();
        car2.drive(120);
        car2.displayInfo();
        car2.stopEngine();
    }
}
