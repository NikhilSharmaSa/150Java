import java.util.Scanner;

public class Program134 {


   
    
    public static void updateElement(int arr[], int index,int value){
arr[index]=value;
    }
    public static void main(String[] args) {
        //WAP to update an element in array at given index
int[] arr= {14,16,12,18,15,14,12,13};
System.out.print("Please enter the Value:");
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();

System.out.print("Enter the Index :");
int index=sc.nextInt();
sc.close();
updateElement(arr, index,value);

for (int i : arr) {
    System.out.print(i+" ");
}


    }


}
