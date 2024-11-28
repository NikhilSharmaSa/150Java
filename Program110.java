
public class Program110 {

    public static int findFactorial(int n){
if(n==0||n==1){
    return 1;
}
return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
          //WAP to find the factorial of every element of array. 
           int[] arr={1,2,3,4,5};
           for(int i=0; i<arr.length; i++){
            int result=findFactorial(arr[i]);
            System.out.println("The factorial of "+arr[i]+" is: "+result);
           }
           


    }
}
