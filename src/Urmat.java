import java.util.Scanner;
public class Urmat {
    public static void main(String[] args){
        // Тескери тартип (for цикл)
        for (int i = 10; i >= 1 ; i--) {
            System.out.println("Тескери: " + i);
        }

        // Коптук таблица
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кобойтуу таблица: 1ден 10го чейин каалаган сан жазыныз.");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Сан 0 эмес учурда сурай беруу
        System.out.println("Сан жазыныз: ");
        int input = scanner.nextInt();

        while (input != 0) {
            System.out.print("Сан жазыныз (чыгуу учун 0 саны): ");
            input = scanner.nextInt();
            System.out.println("Сиз жаздыныз: " + input);
        }

        System.out.println("Программа аяктады.");

    }
}
