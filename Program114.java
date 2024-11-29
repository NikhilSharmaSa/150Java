
public class Program114 {

    public static int findMax(int[] arr){
int max=Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
   if(arr[i]>max){
    max=arr[i];
   }
    }
return max;
    }
    public static void main(String[] args) {
          //WAP to find highest number in an array
           int[] arr={1,2,88,4,5};
           int result=findMax(arr);
           System.out.println("The highest number in array is: "+result);


    }
}
