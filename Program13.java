import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
          //WAP to print  crossponding letters to the number n
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number b/w 1 to 9:");
        int n=sc.nextInt();
        sc.close();

        switch(n){
         case 1:
         System.out.println("One");
         break;
         case 2:
         System.out.println("Two");
         break;
         case 3:
         System.out.println("Three");
         break;
         case 4:
         System.out.println("Four");
         break;
         case 5:
         System.out.println("Five");
         break;
         case 6:
         System.out.println("Six");
         break;
         case 7:
         System.out.println("Seven");
         break;
         case 8:
         System.out.println("Eight");
         break;
         case 9:
         System.out.println("Nine");
         break;
         default:
         System.out.println("Please Enter the Number b/w 1 to 9!");
         break;
        }
    }
}
