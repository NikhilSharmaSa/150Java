import java.util.Scanner;

public class Program80 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                           1
                          222
                         33333
                        4444444
                       555555555
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
