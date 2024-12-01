
public class Program137 {
    public static void findThree(int[] arr){
        int largest=Integer.MIN_VALUE;
       
for(int i=0; i<arr.length; i++){
   if(largest<arr[i]){
    largest=arr[i];
   }
}

int ans=findFactorial(largest);
System.out.println("The factorial of largest number "+largest+" is: "+ ans);

}
    
public static int findFactorial(int n){
if(n==0|| n==1){
    return 1;
}

return n*findFactorial(n-1);
}
    public static void main(String[] args) {
          //WAP to find three largest number
                     int[] arr={-12,2,4,5,4,5,6,4,5,1,5,8}; 
         findThree(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
