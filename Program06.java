import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        //WAP to swap two numbers using third variable 

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a=sc.nextInt();
        System.out.println("Please enter the second number:");
        int b=sc.nextInt();
        sc.close();
System.out.println("The value of a is: "+a);
System.out.println("The value of b is: "+b);

int temp=a;
a=b;
b=temp;

System.out.println("<----------SWAPPED VALUE-------->");
System.out.println("a:"+a);
System.out.println("b: "+b);


    }
}
