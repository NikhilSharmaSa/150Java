import java.util.Scanner;

public class Program32 {

    public static int find_factorial(int n){
        if(n==0|| n==1){
            return 1;
        }

        return n*find_factorial(n-1);
    }
    public static void main(String[] args) {
        //WAP to find the factorial of n numbers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0; i<=n; i++){
            int ans=find_factorial(i);
            System.out.println("The factorial of the number "+i+" is: "+ans);
        }
    }
}
