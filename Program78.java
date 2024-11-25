import java.util.Scanner;

public class Program78 {
    public static void main(String[] args) {
        /*
                  *
                ***
              *****
            *******
          *********
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
System.out.print('*');

            }
            System.out.println();
        }


    }
}
