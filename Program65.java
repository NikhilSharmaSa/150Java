import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        /*
          54321
          4321
          321
          21
          1
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
           
            for(int j=n; j>=i; j--){
System.out.print(j);
            }
            System.out.println();
        }


    }
}
