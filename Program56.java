import java.util.Scanner;

public class Program56 {
    public static void main(String[] args) {
         //WAP to print the following pattern 
              /*
                        
                        EDCBA
                        EDCBA
                        EDCBA
                        EDCBA
                        EDCBA
              */
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the Number of rows:");
              int n=sc.nextInt();
            
              sc.close();
              for(int i=1; i<=n;i++){
                char ch='E';
                for(int j=1; j<=n; j++){
                    System.out.print(ch);
                    ch--;
                }
                System.out.println();
                
              }
    }
    
}
