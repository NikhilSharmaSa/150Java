import java.util.Scanner;

public class Program24 {

    public static int findsumofdigits(int n) {
       int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // WAP to find the sum of digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = findsumofdigits(n);
        System.out.println("The sum of digits of number is : " + ans);
    }
}