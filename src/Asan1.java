import java.util.Scanner;

public class Asan1 {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("0")) {
            System.out.println("Цифра бер");
            input = scanner.nextLine();
            System.out.println("Ушул санды бердим" + input);

        }
        System.out.println("Туура");

    }
*/


        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println("таблица 0...10");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + x + "=" + (x * i));
            {
                scanner.close();
            }

        }
    }
}



