import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
              //WAP to print the following pattern 
              /*
                            *
                           **
                          ***
                         ****
                        *****
                  
               */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();


        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
