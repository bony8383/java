package basics.azamat.begimai;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;
    private String profession;

    //konstruktor bez param
    public Student() {

    }

    //konstruktor s parametrom
    public Student(String name, int age, String group, String profession) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.profession = profession;


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
        this.age = age;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getProfession() {
        return profession;

    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    //massiv
    Student[]students=new Student[5];
    int counter=0;


    public void addStudent(){
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
        System.out.println("Was kostet Studium?");
        Contract contract=new Contract();
        contract.setPrice(scanner1.nextInt());

        students[counter++]=student;
        System.out.println("Student ist gespeichert");
    }
    public void showAllStudents(){
      for (int i = 0; i<counter; i++){
          System.out.println("Name; " + students[i].getName());
          System.out.println("Alter; " + students[i].getAge());
          System.out.println("Gruppe; " +students[i].getGroup());
          System.out.println("Beruf; " + students[i].getProfession());


      }

    }

//System.out.println("Name; " + student.getName());
        //System.out.println("Alter; " + student.getAge());
        //System.out.println("Gruppe; " + student.getGroup());
        //System.out.println("Beruf; " + student.getProfession());
        //System.out.println("Preis " + contract.getPrice());

}
