import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                        1
                        21
                        321
                        4321
                        54321
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
