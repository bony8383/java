package arrays.asan;

import java.util.Scanner;

public class ZweiArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Массивдин суммасын жаз");
        int nummers = scanner.nextInt();

        int[] nummers1 = new int[nummers];
        int sum = 0;

        System.out.println("Сан киргиз");
        for (int i = 0; i < nummers; i++) {
            nummers1[i] = scanner.nextInt();
            sum += nummers1[i];
        }
        System.out.println("Массивдин суммасы" + sum);
        System.out.println("Массивдин орточо суммасы" + (sum / (double) nummers));

        scanner.close();
    }
    }

