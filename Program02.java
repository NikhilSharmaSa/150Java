import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        //WAP to find the area of circle
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float radius= sc.nextFloat();
        sc.close();
        System.out.println("The area of circle is :"+(3.14*radius*radius)+" square unit");

    }
}
