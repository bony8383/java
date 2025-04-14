package oop.omka2;
// Мурастоо
public class Car extends Vehicle {
    private String brand;
    private int year;
    private double mileage;

    public Car() {
        this.brand = "Unknown";
        this.year = 2000;
        this.mileage = 0.0;
    }

    // Параметр менен конструктор
    public Car(String brand, int year, double mileage) {
        this.setBrand(brand);
        this.setYear(year);
        this.setMileage(mileage);
    }

    // Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Brand name can't be empty.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885) {
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.out.println("Mileage can't be negative.");
        }
    }

    public void drive(double distance) {
        if (distance > 0) {
            mileage += distance;
            System.out.println("Car drove " + distance + " km. Total mileage: " + mileage + " km.");
        } else {
            System.out.println("Distance must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage + " km");
    }
}

