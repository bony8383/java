package ifelse.urmat;

import java.util.Scanner;
/**
 1.  Выбор одежды по температуре:
    Спросите у пользователя температуру (например, int temperature) и проверьте следующие условия:
        - Выше 30 градусов: «Погода жаркая. Наденьте лёгкую одежду».
        - От 0 до 30 градусов: «Носите обычную одежду».
        - Ниже 0 градусов: «Погода холодная. Наденьте тёплую одежду».
    Используйте структуру if-else if-else и выведите соответствующее сообщение в консоль.

 2. Система оценивания:
    Получите у пользователя балл (от 0 до 100) и с помощью if-else определите оценку:
         - 90–100: «5»
         - 70–89: «4»
         - 50–69: «3»
         - 0–49: «2»
    Проверьте соответствие значения заданному интервалу с помощью логических операторов.
*/

public class WheaterAdvice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор одежды по температуре
        System.out.print("Какова температура воздуха на улице?: ");
        int temperature = scanner.nextInt();

        if (temperature >= 30) {
            System.out.println("Погода жаркая. Наденьте легкую одежду.");
        } else if (temperature >= 12 && temperature < 30) {
            System.out.println("Носите обычную одежду.");
        } else System.out.println("Погода холодная. Наденьте теплую одежду");

        // Система оценивания
        System.out.print("Канча балл алдыныз? (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("5 деген баа коюлду.");
        } else if (score >= 70) {
            System.out.println("4 деген баа коюлду.");
        } else if (score >= 50) {
            System.out.println("3 деген баа коюлду.");
        } else {
            System.out.println("2 деген баа коюлду.");
        }

    }
}
