import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        //WAP to find the average of five subjects.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subject 1:");
        int num1= sc.nextInt();
        System.out.println("Enter the number of subject 2:");
        int num2= sc.nextInt();
        System.out.println("Enter the number of subject 3:");
        int num3= sc.nextInt();
        System.out.println("Enter the number of subject 4:");
        int num4= sc.nextInt();
        System.out.println("Enter the number of subject 5:");
        int num5= sc.nextInt();
        sc.close();

        int avg= (num1+num2+num3+num4+num5)/5;
        System.out.println("The average of five subjects is:"+ avg);
    }
}
