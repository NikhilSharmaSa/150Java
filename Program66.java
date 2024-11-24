import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        /*
          EDCBA
          EDCB
          EDC
          ED
          E

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
            char ch='E';
            for(int j=1; j<=n-i+1; j++){
System.out.print(ch);
ch--;
            }
            System.out.println();
        }


    }
}
