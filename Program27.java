import java.util.Scanner;

public class Program27 {

    public static int findsumofdigits(int n) {
        int binary = 0;

        while (n > 0) {

            int r = n % 2;


    binary = binary * 10 + r;


            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        // WAP to conver decimal number to binary number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = findsumofdigits(n);
        System.out.println("The binary number of given decimal number is  : " + ans);
    }
}
