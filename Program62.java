import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        /*
          A B C D E
          A B C D 
          A B C
          A B 
          A
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=1; i<=n; i++){
            char ch='A';
            for(int j=1; j<=n-i+1; j++){
System.out.print(ch+" ");
ch++;
            }
            System.out.println();
        }


    }
}
