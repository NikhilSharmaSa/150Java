import java.util.Scanner;

public class Program23 {

    public static int findreverse(int n) {
       int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        // WAP to print reverse of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = findreverse(n);
        System.out.println("The reverse of the number is: " + ans);
    }
}
