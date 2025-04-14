// Version 1.0
package oop.omka;

public class Main {
    public static void main(String[] args){
        Auto car1 = new Auto();
        car1.setMarka("Toyota");
        car1.setPreis(5000);

        Auto car2 = new Auto("BMW", 10000);

        // Наследованный методдор
        car1.start();
        car1.all();
        car1.stop();

        System.out.println();

        car2.start();
        car2.all();
        car2.stop();

        // Setter текшерүү
        car1.setPreis(7000);
        System.out.println("Жаңыртылган баасы: " + car1.getPreis() + " доллар");
    }
}
// Ozgortuu