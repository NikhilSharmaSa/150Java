import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
          //WAP to check entered number is divisible by 7 or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        if(n%7==0){
            System.out.println("The following number is DIVISIBLE by 7");
        }else{
            System.out.println("The following number is NOT-DIVISIBLE by 7");
        }
    }
    
}
