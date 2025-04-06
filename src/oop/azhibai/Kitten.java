package oop.azhibai;

public class Kitten extends Cat{
    private boolean vaccinated;
    private boolean canEatSolidFood;

    public Kitten(String name, int age, String color, int weigth, boolean vaccinated, boolean canEatSolidFood) {
        super(name, age, color, weigth);
        this.vaccinated = vaccinated;
        this.canEatSolidFood = canEatSolidFood;
    }
    public String getKitteninfo(){
        return "Kitten's name: " + getName() +
                ", age: " + getAge() +
                ", color: " + getColor() +
                ", weight: " + getWeigth() +
                " kg, vaccinated: " + vaccinated +
                ", can eat solid food: " + canEatSolidFood;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isCanEatSolidFood() {
        return canEatSolidFood;
    }

    public void setCanEatSolidFood(boolean canEatSolidFood) {
        this.canEatSolidFood = canEatSolidFood;
    }
}
