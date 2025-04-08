package ifelse.urmat;
import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Жети кундун бирин сан турундо жазыныз?: ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1 -> System.out.println("Дуйшомбу");
            case 2 -> System.out.println("Шейшемби");
            case 3 -> System.out.println("Шаршемби");
            case 4 -> System.out.println("Бейшемби");
            case 5 -> System.out.println("Жума");
            case 6 -> System.out.println("Ишемби");
            case 7 -> System.out.println("Жекшемби");
            default -> System.out.println("Апта 7 кун менен эсептелет!");
        }

        System.out.print("Выберите дальнейшее действие 1(Калькулятор), 2(Список курсов), 3(Выход из программы): ");
        int menuTab = scanner.nextInt();
        switch (menuTab) {
            case 1 -> System.out.println("Перейти к калькулятору");
            case 2 -> System.out.println("Посмотреть список курсов");
            case 3 -> System.out.println("Выход");
            default -> System.out.println("Неизвестная команда!");
        }

        scanner.close();
    }

}
