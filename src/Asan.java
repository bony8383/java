
import java.util.Scanner;

public  class Asan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кобойтуу таблицасыга сан бер");
        int x = scanner.nextInt();
        System.out.println("таблица");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + x + "=" + (x * i));
            {
                scanner.close();
            }
        }
    }
}

