import java.util.Scanner;

public class Program18 {

    public static int findsum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }

        return sum;
    }
    public static void main(String[] args) {
           //WAP to find the sum of n numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        int ans=findsum(n);
        System.out.println("The sum of n numbers is: "+ans);
    }
}
