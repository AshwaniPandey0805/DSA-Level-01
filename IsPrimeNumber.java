import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int  i = 0;
        while ( i < t) {
            int n = scn.nextInt();
            int count = 0;
            for(int j = 2; j * j <= n; j++) {
                if(n % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.println("Is prime number : " + n);
            } else {
                System.out.println("Not a prime number : " + n);
            }
        }
    }
}
