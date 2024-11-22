import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                        1
                        2 3
                        4 5 6
                        7 8 9 10
                        11 12 13 14 15
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        
        sc.close();
int o=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(o+" ");
                o++;
            }
            System.out.println();
        }
    }
}
