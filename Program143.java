import java.util.Scanner;

public class Program143 {
    public static int findPower(int n, int p){
       int k=n;
for(int i=2; i<=p; i++){
 k*=n;
}
return k;
}
    
    public static void main(String[] args) {
      //WAP to find the power of given number
      System.out.println("Please Enter the Number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Please Enter the number of Powers:");
      int p=sc.nextInt();
      sc.close();
      int ans=findPower(n, p);
      System.out.println(n +" Power "+p+ ": "+ans);

   
                    

        


    }
}
