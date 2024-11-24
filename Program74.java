import java.util.Scanner;

public class Program74 {
    public static void main(String[] args) {
        /*
          1
          22
          333
          4444
          55555
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
System.out.print(i);
            }
            System.out.println();
        }


    }
}
