import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("obratnyi zikl");

        for (int i = 10; i >= 1; i--) {
            System.out.println(+i);
        }
        Scanner scanner = new Scanner(System.in);


        System.out.println("Gib zahl ein?");
        int a = scanner.nextInt();
        for (int c = 1; c <= 10; c++) {
            System.out.println(a + "*" + c + "=" + (a * c));
            scanner.close();
        }
    }
}
