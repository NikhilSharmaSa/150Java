import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        /*
          AAAAA
          BBBB
          CCC
          DD
          E
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i+1; j++){
System.out.print(ch);

            }
            ch++;
            System.out.println();
        }


    }
}
