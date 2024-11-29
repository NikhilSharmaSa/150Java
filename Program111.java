
public class Program111 {

    public static int findEvenSum(int[] arr){
int sum=0;
for(int i=0; i<arr.length; i++){
    if(arr[i]%2==0){

        sum+=arr[i];
    }
    }
return sum;
    }
    public static void main(String[] args) {
          //WAP to find the sum of even numbers in an array
           int[] arr={1,2,3,4,5};
           int result=findEvenSum(arr);
           System.out.println("The sum of only Even array elements: "+result);


    }
}
