import java.util.Scanner;

public class Program60 {
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
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=n-i+1; j++){
System.out.print(j);

            }
            System.out.println();
        }


    }
}
