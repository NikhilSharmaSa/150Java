
public class Program122 {

    public static int findLength(int[] arr){
int count=0; 
for (int i : arr) {
    count++;
}
return count;
    }
    public static void main(String[] args) {
          //WAP to find the length of an array
           int[] arr={-12,2,88,4,5,4,5,6,4,5,44,4,5,8};
           
          int result= findLength(arr);
          System.out.println("The length of the array is: "+result);


    }
}
