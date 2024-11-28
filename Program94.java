import java.util.Scanner;

public class Program94 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                    A
                   ABA
                  ABCBA
                 ABCDCBA
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1; i<n; i++){
            for(int k=1; k<n-i; k++){
                System.out.print(" ");
            }
            char ch='A';
            char temp='A';
            for(int j=1; j<=i; j++){
                
                System.out.print(ch);
                temp=ch;
                ch++;
            }
            
            for(int j=2; j<=i; j++){
                temp--;
                System.out.print(temp);
                
            }
           
            System.out.println();
        }
    }
}
