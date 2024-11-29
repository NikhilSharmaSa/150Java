
public class Program115 {

    public static int findMin(int[] arr){
int min=Integer.MAX_VALUE;
for(int i=0; i<arr.length; i++){
   if(arr[i]<min){
    min=arr[i];
   }
    }
return min;
    }
    public static void main(String[] args) {
          //WAP to find lowest number in an array
           int[] arr={-12,2,88,4,5};
           int result=findMin(arr);
           System.out.println("The lowest number in array is: "+result);


    }
}
