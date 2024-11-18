import java.util.Scanner;

public class Program29 {

    public static int find_factorial(int n){
        if(n==0|| n==1){
            return 1;
        }

        return n*find_factorial(n-1);
    }

    public static void main(String[] args) {
        //WAP to find nPr
 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of r:");
        int r=sc.nextInt();
        sc.close();
        int ans=find_factorial(n)/find_factorial(n-r);
        System.out.println(ans);

    }
}
