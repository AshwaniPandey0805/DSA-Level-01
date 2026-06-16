import java.util.Scanner;

public class CountDigitInANUmber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int digit = 0;

        if(n == 0) {
            System.out.println("Number of digits is : 1");
            return;
        } else {
            while (n != 0) {
                n = n / 10;
                digit++;
            }
        }


        System.out.println("Number of digits are : " + digit);
    }
}