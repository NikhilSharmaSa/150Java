
public class Program109 {

    public static int findSum(int[] arr){
int sum=0;
for(int i=0; i<arr.length; i++){
    sum+=arr[i];
}
return sum;
    }
    public static void main(String[] args) {
          //WAP to find the sum of array elements
           int[] arr={1,2,3,4,5};
           int result=findSum(arr);
           System.out.println("The sum of array elements: "+result);


    }
}
