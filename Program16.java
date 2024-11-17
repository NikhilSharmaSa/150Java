import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        //WAP to print first n odd numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
       
        }
    }
}
