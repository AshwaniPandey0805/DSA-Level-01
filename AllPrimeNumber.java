import java.util.Scanner;

public class AllPrimeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int from = scn.nextInt();
        int to = scn.nextInt();

        for(int i = from; i <= to; i++) {
            int count = 0;
            for(int j = 2; j * j < i; j++) {
                if(i % j == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0) {
                System.out.println("Prime number : " + i);
            }
        }
        
        
    }
}