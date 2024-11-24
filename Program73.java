import java.util.Scanner;

public class Program73 {
    public static void main(String[] args) {
        /*
          EEEEE
          DDDD
          CCC
          BB
          A

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        char ch='E';
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=n-i+1; j++){
System.out.print(ch);

            }
            ch--;
            System.out.println();
        }


    }
}
