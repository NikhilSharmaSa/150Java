import java.util.Scanner;

public class Program93 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                      1
                     121
                    12321
                   1234321
                  123454321
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
                
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
