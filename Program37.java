import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
              //WAP to print the following pattern 
              /*
                        12345
                        12345
                        12345
                        12345
                  
               */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();


        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
