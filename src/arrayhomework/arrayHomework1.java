package arrayhomework;

import java.util.Arrays;

public class arrayHomework1 {
    public static void main(String[] args) {

        int[] sandar = {5, 9, 7, 8, 4, 6, 1, 3, 97, 67};
        int summa = 0;
        for (int a : sandar) {
            summa += a;
            System.out.println(" jalpy summa " + summa);
        }


        int[] personal = {1, 2, 3, 4, 5, };
        int jyiyntyk = 0;
        for (int san : personal) {
            jyiyntyk += san;
            System .out .println( " Personaldardyn jalpy sany kancha ? " + jyiyntyk);


            int[] nums = {8, 2, 5, 1, 9};
            System.out.println("Ursprüngliches Array: " + Arrays.toString(nums));

            Arrays.sort(nums);
            System.out.println("Nach dem Sortieren: " + Arrays.toString(nums));

            int jok = Arrays.binarySearch(nums, 5);
            System.out.println("Index des Elements : " + jok);

            int[] numbers = {1, 2, 3, 4, 5};

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Элемент №" + i + " = " + numbers[i]);


            }
            int[] patient = {45, 67, 78, 98, 34};
            int komnata = Arrays.binarySearch(patient, 98);
            System.out.println(" 98 jashtagy Hr.M kaisy komnatada jatat? " + komnata);

        }

    }
}