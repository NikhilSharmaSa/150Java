import java.util.Scanner;

public class Program91 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                      0
                     101
                    21012
                   3210123
                  432101234
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++){
            for(int k=1; k<=n-i; k++){
System.out.print(" ");
            }
           
            for(int j=i; j>=0; j--){
                
                System.out.print(j);
            }
            for(int j=1; j<=i; j++){
                
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
