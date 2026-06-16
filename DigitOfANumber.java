import java.util.Scanner;

public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();

        // step 01 : Find the divisor for the gievn number
        int count = 0;
        int temp = n;

        while(temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Here we find the devisor that divides the given number
        int divisor = (int)Math.pow(10, count - 1);

        // Step 02 : Now we print the digits of the number

        while (divisor != 0) {
            int q = n / divisor;
            System.out.println(q);
            n = n % divisor;
            divisor = divisor / 10;
        }
    }
}
