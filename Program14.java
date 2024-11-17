import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        //WAP to print  crossponding letters to the number n
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();

        switch(n){
         case 1:
         case 11:
         case 12:
         case 10:
         System.out.println("SUMMER");
         break;
         case 2:
         case 3:
         case 4:
         case 5:
         System.out.println("SPRING");
         break;
         case 6:
         case 7:
         case 8:
         case 9:
         System.out.println("RAINING");
         break;
         default:
         System.out.println("Please Enter the Valid number");
         break;
        }
    }
    
}
