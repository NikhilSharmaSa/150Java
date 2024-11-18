import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
         //WAP to print the table from n to m
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        sc.close();
        for(int i=n; i<=m; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
