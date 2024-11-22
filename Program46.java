import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                        *****
                         ****
                          ***
                           **
                            *
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
                 
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
