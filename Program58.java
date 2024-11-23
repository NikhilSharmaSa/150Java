import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        /*
          A
          AB
          ABC
          ABCD
          ABCDE
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            char ch='A';
            for(int j=1; j<=i; j++){
System.out.print(ch);
ch++;
            }
            System.out.println();
        }


    }
}
