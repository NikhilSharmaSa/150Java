import java.util.*;

public class Program28 {
    public static void main(String[] args) {
        //WAP to check enter number is prime or not 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i!=0){
                System.out.println("The number is Prime");
                break;
            }else{

                System.out.println("The number is not Prime");
            }
        }
    }
}
