import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        //WAP to print the table of the given number
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        sc.close();

    for(int i=1; i<=10; i++){
System.out.print(n*i+" ");
    }
    }
}
