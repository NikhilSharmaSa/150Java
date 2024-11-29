
public class Program112 {

    public static int findOddSum(int[] arr){
int sum=0;
for(int i=0; i<arr.length; i++){
    if(arr[i]%2==0){

      
    }
    else{
        sum+=arr[i];
    }
    }
return sum;
    }
    public static void main(String[] args) {
          //WAP to find the sum of even numbers in an array
           int[] arr={1,2,3,4,5};
           int result=findOddSum(arr);
           System.out.println("The sum of only Odd array elements: "+result);


    }
}
