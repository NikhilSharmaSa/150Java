import java.util.Scanner;

public class Program01 {
    //WAP to find the addition of two numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
   int a=sc.nextInt();
   
System.out.println("Enter the second number:");
   int b=sc.nextInt();
sc.close();
   System.out.println("The addition of two number is: "+(a+b));
    }
}
