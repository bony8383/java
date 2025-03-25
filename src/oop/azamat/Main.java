package oop.azamat;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Азамат");
        p.setAge(49);

        p.sayHello();

        System.out.println("Аты: " + p.getName());
        System.out.println("Жашы: " + p.getAge());
    }
}
