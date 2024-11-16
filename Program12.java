import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
         //WAP to check enter character is vowel or not 
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the character:");
        char n=(sc.next().toLowerCase()).charAt(0);
        sc.close();
        if(n=='a' || n=='e'|| n=='i'|| n=='o'|| n=='u'){
            System.out.println("The following character is VOWEL");
        }else{
            System.out.println("The following character is  Consonant");
        }
    }
}
