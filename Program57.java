import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
         //WAP to print the following pattern 
              /*
                        
                        A
                        BB
                        CCC
                        DDDD
                        EEEEE
              */
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the Number of rows:");
              int n=sc.nextInt();
              char ch='A';
              sc.close();
              for(int i=1; i<=n;i++){
                
                for(int j=1; j<=i; j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
                
              }
    }
    
}
