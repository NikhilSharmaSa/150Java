import java.util.Scanner;

public class Program72 {
    public static void main(String[] args) {
        /*
          12345
           1234
            123
             12
              1
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        for(int i=n; i>=1; i--){
            for(int k=0; k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
System.out.print(j);
            }
            System.out.println();
        }


    }
}
