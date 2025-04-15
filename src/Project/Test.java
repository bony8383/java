package Project;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Атыңызды жана фамилияңызды жазыңыз: ");
        String fullName = scanner.nextLine();

        String[] questions = {
                "1. Java кайсы программалоо тилине кирет? \nА) Интерпреттелген \nB) Компиляцияланган \nC) Экиөөнүн тең \nD) Скрипт тили",
                "2. Javaда кантип классты аныктайбыз? \nА) function MyClass \nB) class MyClass \nC) def MyClass \nD) struct MyClass",
                "3. Javaда массивди кантип жаратабыз? \nА) int arr[] = new int[5]; \nB) array arr[5]; \nC) int arr[5]; \nD) list arr = new list();",
                "4. 'public static void main(String[] args)' деген эмне? \nА) Метод \nB) Класс \nC) Интерфейс \nD) Түзмөк",
                "5. Javaда мурастоо үчүн кайсы ачкыч сөз колдонулат? \nА) this \nB) super \nC) extends \nD) implements",
                "6. Javaда интерфейс деген эмне? \nА) Объект \nB) Методу жок класс \nC) Өзгөрмө \nD) Массив түрү",
                "7. Javaда try-catch эмне үчүн колдонулат? \nА) Цикл жазуу үчүн \nB) Объект түзүү үчүн \nC) Ката кармоо үчүн \nD) Массивди кайтаруу үчүн",
                "8. Javaда 'this' деген эмне билдирет? \nА) Тышкы объект \nB) Учурдагы объект \nC) Интерфейс \nD) Массив",
                "9. Javaда кайсы коллекция уникалдуу маанилерди сактайт? \nА) ArrayList \nB) HashSet \nC) LinkedList \nD) Queue",
                "10. Javaда кайсы модификатор эң катуу? \nА) public \nB) protected \nC) private \nD) default"
        };

        String[] correctAnswers = {"C", "B", "A", "A", "C", "B", "C", "B", "B", "C"};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Жооп: ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(correctAnswers[i])) {
                score += 6;
            }
        }
        System.out.println("\nЖыйынтык:");
        System.out.println("Аты-жөнү: " + fullName);
        System.out.println("Жалпы упай: " + score + " балл");

        if (score < 10) {
            System.out.println("Жыйынтык: Тесттен өтпөдүңүз.");
        } else if (score < 30) {
            System.out.println("Баа: 3");
        } else if (score < 60) {
            System.out.println("Баа: 4");
        } else {
            System.out.println("Баа: 5");
        }

        scanner.close();
    }
}
