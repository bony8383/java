package basics.azamat.begimai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("geben Sie bitte Name ein?");
        student.setName(scanner.nextLine());
        System.out.println("geben Sie bitte Alter ein?");
        student.setAge(scanner1.nextInt());
        System.out.println("geben Sie bitte Gruppe ein?");
        student.setGroup(scanner.nextLine());
        System.out.println("geben Sie bitte Beruf ein?");
        student.setProfession(scanner.nextLine());

        scanner.close();

        System.out.println("Name; " + student.getName());
        System.out.println("Alter; " + student.getAge());
        System.out.println("Gruppe; " + student.getGroup());
        System.out.println("Beruf; " + student.getProfession());
    }
}
