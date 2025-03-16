package modul4;
import java.util.Scanner;

public class aizatar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Кайсыл сандын кобойтуу таблицасы керек?");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));

        }


        System.out.println("Артка кетуу санын жазыныз");
        int num2 = scanner.nextInt();
        for (int j = num2; j >= 1; j--) {
            System.out.println(j);
        }

        scanner.close();



    }
}
