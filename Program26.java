import java.util.Scanner;

public class Program26 {

    public static int findsumofdigits(int n) {
       int sum=0;
       int place=1;
        while(n>0){
          
            int r=n%10;
            if(place%2!=0){
                sum+=r;
            }
           
            n=n/10;
            place++;
        }
        return sum;
    }

    public static void main(String[] args) {
        // WAP to find the sum of digits in odd place of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = findsumofdigits(n);
        System.out.println("The sum of digits in odd place of number is : " + ans);
    }
}
