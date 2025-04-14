package oop.azhibai;

public class Cat {
    private String name;
    private int age;
    private String color;
    private int weigth;

    // default constructor
    public Cat(){
       this.name = "No name";
       this.age = 0;
       this.color = "No color";
       this.weigth = 0;
    }
    public Cat(String name, int age, String color, int weigth){
        this.name = name;
        this.age = age;
        this.color = color;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        } else {
            System.out.println("Invalid cat age!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        if (weigth >= 0) {
            this.weigth = weigth;

        } else {
            System.out.println("Invalid cat weith ");
        }
    }
    public void run(){
        System.out.println("Despite being " + weigth + " kg, the " + color + " " + name + ", who is " + age + " years old, runs very fast!");
    }
    public String getCatsummary(){
        return "Cat's name is " + name + ", it is " + age + " years old, its color " + color + ", and it weigths " + weigth + "kg";
    }
}
