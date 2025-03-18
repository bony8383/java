package arrays.azamat;

import java.util.Arrays;

public class OneArray {
    public static void main(String[] args) {
        int[] numbers;
        // numbers = new int[5];

        numbers = new int[]{10, 20, 30, 40, 50};

        int[] players;
        players = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] teams;
        teams = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Биринчи элемент: " + numbers[0]);
        System.out.println("Экинчи элемент: " + numbers[1]);

        System.out.println("Массивдин узундугу: " + numbers.length);

        System.out.println("Numbers массиви: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент № (i)" + i + " = " + numbers[i]);
        }
    }
}
