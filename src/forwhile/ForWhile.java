package forwhile;

public class ForWhile {
    public static void main (String [] args){
        // for
        System.out.println(" for цикли:");
        for (int i = 1; i < 5; i++){
            System.out.println( "Сан ( for): " +i);

            // while
            System.out.println(" while:");
            int j = 1;
            while (j <= 5){
                System.out.println("Сан (while):"  + j );
                j++ ;
            }
        }
    }
}
