import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        //WAP to check entered number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("The following number is EVEN");
        }else{
            System.out.println("The following number is ODD");
        }
    }
}
