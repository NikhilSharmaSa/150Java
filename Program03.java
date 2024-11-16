import java.util.Scanner;
public class Program03 {
    

    public static void main(String[] args) {
        //WAP to find the area oftriangle
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base of triangle:");
        float b= sc.nextFloat();
        System.out.println("Enter the height of triangle:");
        float h= sc.nextFloat();
        sc.close();
        float area=(b*h)/2;
        System.out.println("The area of triangle is :"+(area)+" square unit");

    }
}
