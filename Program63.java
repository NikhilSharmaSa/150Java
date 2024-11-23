import java.util.Scanner;

public class Program63 {
    public static void main(String[] args) {
        /*
          55555
          4444 
          333
          22 
          1
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=n-i+1; j++){
System.out.print(n-i+1);
            }
            System.out.println();
        }


    }
}
