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

        //Максимум табуу
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максималдуу маани: " + max);

        //Минимум табуу
        int min  = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минималдуу маани: " + min);
    }
}
