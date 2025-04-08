package variable.urmat;

import java.util.Scanner;

public class ArithmeticOper {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
    int numA = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
    int numB = scanner.nextInt();

        System.out.println("Сложение: " + (numA + numB));
        System.out.println("Вычитание: " + (numA - numB));
        System.out.println("Умножение: " + (numA * numB));
        System.out.println("Деление: " +  ((double)numA / numB));
        System.out.println("Остаток: " + (numA % numB));

        System.out.println("---------------------------");

        boolean equal = (numA == numB);
        boolean more = (numA > numB);
        boolean lessOrEqual = (numA <= numB);

        System.out.println("Они равны: " + equal);
        System.out.println("Первый больше второго: " + more);
        System.out.println("Первый меньше или равно второму: " + lessOrEqual);


    }
}
