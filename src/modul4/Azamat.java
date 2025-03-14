package modul4;
import java.util.Scanner;

public class Azamat {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ) {
            System.out.println("Сан: " + i);
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Сөз жаз (чыгыш үчүн 'exit'): ");
            input = scanner.nextLine();
            System.out.println("Сиз жаздыңыз: " + input);
        }

        System.out.println("Программа аяктады.");

    }
}
