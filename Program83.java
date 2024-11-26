import java.util.Scanner;

public class Program83 {
    public static void main(String[] args) {
          //WAP to print the following pattern 
              /*
                    A
                    CCC
                    EEEEE
                    FFFFFFF
                    GGGGGGGGG
              */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int n=sc.nextInt();
        sc.close();
char ch='A';
        for(int i=1; i<=n; i++){
           
            for(int j=1; j<=2*i-1; j++){
                
                System.out.print(ch);
            }
            if(i==1 || i==2){
                ch+=2;
            }else{
                ch++;
            }
            System.out.println();
        }
    }
}
