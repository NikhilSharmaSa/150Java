import java.util.Scanner;

public class Program50 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                        11111
                        22222
                        33333
                        44444
                        55555
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();    
        }
    }
}
