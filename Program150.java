import java.util.Scanner;

public class Program150 {
    public static int countDigit(int n){
        int count=0;
if(n<10){
    return 1;
}
while(n!=0){
    count++;
    n=n/10;
}

return count;

    }
    public static void main(String[] args) {
        //WAP to count the digits of the given number 
        System.out.print("Please enter the number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int ans=countDigit(n);
        System.out.println(ans);

    }
}
