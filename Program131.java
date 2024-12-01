
public class Program131 {
    public static void findThree(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
   if(largest<arr[i]){
    largest=arr[i];
   }
}
for(int i=0; i<arr.length; i++){
    if(largest>arr[i]  && secondLargest<arr[i]){
     secondLargest=arr[i];
    }
 }

 for(int i=0; i<arr.length; i++){
    if(secondLargest>arr[i]  && thirdLargest<arr[i]){
     thirdLargest=arr[i];
    }
 }
System.out.println(largest);
System.out.println(secondLargest);
System.out.println(thirdLargest);
}
    
    public static void main(String[] args) {
          //WAP to find three largest number
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,1,5,8}; 
         findThree(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
