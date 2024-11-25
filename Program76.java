import java.util.Scanner;

public class Program76 {
    public static void main(String[] args) {
        /*
          EEEEE
           DDDD
            CCC
             BB
              A
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        char ch='E';
        for(int i=n; i>=1; i--){
           
            for(int k=0; k<n-i;  k++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
System.out.print(ch);

            }
            ch--;
            System.out.println();
        }


    }
}
