import java.util.Scanner;

public class Program85 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                       1
                       123
                       12345
                       1234567
                       123456789
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*i-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
