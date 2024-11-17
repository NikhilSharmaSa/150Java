import java.util.Scanner;

public class Program22 {

    public static int findfact(int n) {
       if(n==1|| n==0){
        return 1;
       }

       return n*findfact(n-1);
        
    }

    public static void main(String[] args) {
        // WAP to find the factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = findfact(n);
        System.out.println("The factorial of the number is : " + ans);
    }
}
