package arrays.urmat;

import java.util.Scanner;
import java.util.Arrays;

public class OneArray {
    public static void main(String[] args){

        //Сандык массив толтуруу
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Беш орундуу массивге сан менен маани бериниз: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Массив суммасы: " + Arrays.stream(numbers).sum());
        System.out.println("Массив орточо мааниси: " + Arrays.stream(numbers).average());
    }
}
