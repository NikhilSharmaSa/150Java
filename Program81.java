import java.util.Scanner;

public class Program81 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                    A
                    BBB
                    CCCCC
                    DDDDDDD
                    EEEEEEEEE
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();
char ch='A';
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=2*i-1; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
