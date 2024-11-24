import java.util.Scanner;

public class Program71 {
    public static void main(String[] args) {
        /*
          55555
           4444
            333
             22
              1
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int n=sc.nextInt();
        sc.close();
       
        for(int i=n; i>=1; i--){
            for(int k=0; k<n-i;k++){
                System.out.print(" ");
            }
           
            for(int j=i; j>=1; j--){
System.out.print(i);
            }
            System.out.println();
        }


    }
}
