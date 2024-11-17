import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        //WAP to print first n numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
