
public class Program116 {

    public static int findSecondMax(int[] arr){
int max=Integer.MIN_VALUE;
int second_max=Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
   if(arr[i]>max){
    max=arr[i];
   }
    }
    for(int i=0; i<arr.length; i++){
        if(max>arr[i]&& arr[i]>second_max){
            second_max=arr[i];
        }
    }
return second_max;
    }
    public static void main(String[] args) {
          //WAP to find second highest number in an array
           int[] arr={1,2,88,4,5};
           int result=findSecondMax(arr);
           System.out.println("The Second highest number in array is: "+result);


    }
}
