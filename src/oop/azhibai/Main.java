package oop.azhibai;

public class Main {
    public static void main(String[] args){

        Cat cat1 = new Cat();
        cat1.setName("Tom");
        cat1.setAge(10);
        cat1.setColor("gray");
        cat1.setWeigth(7);
        System.out.println(cat1.getCatsummary());

        Cat cat2 = new Cat("Garfield",11,"white", 15);
        cat2.run();

        //бала класс
        Kitten kitten = new Kitten("Luna", 2, "gray", 1, true, true);
        System.out.println(kitten.getKitteninfo());
    }


}
