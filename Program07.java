import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        //WAP to swap two numbers without using third variable 

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a=sc.nextInt();
        System.out.println("Please enter the second number:");
        int b=sc.nextInt();
        sc.close();
System.out.println("The value of a is: "+a);
System.out.println("The value of b is: "+b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("<----------SWAPPED VALUE-------->");
System.out.println("a:"+a);
System.out.println("b: "+b);


    }
}
