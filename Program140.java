
public class Program140 {
    public static void findThree(int[] arr){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
for(int i=0; i<arr.length; i++){
   if(largest<arr[i]){
    largest=arr[i];
   }
}

 for(int i=0; i<arr.length; i++){
    if( smallest>arr[i]){
    smallest=arr[i];
    }
 }
System.out.println("The difference b/w Largest and Smallest elements is:"+(largest-smallest));
}
    
    public static void main(String[] args) {
          //WAP to find three largest number
                     int[] arr={12,2,88,4,5,4,5,6,4,5,44,1,5,8}; 
         findThree(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
