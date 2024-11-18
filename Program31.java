import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        //WAP to find the factorial of a number using do-while loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        int ans=1;
        do{
            if(n==0 || n==0){
                break;
            }
            ans*=n;
            n--;
        }while(n>1);

        System.out.println(ans);
    }
}
