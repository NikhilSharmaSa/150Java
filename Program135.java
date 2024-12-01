
public class Program135 {
    public static void findThree(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        int thirdsmallest=Integer.MAX_VALUE;
for(int i=0; i<arr.length; i++){
   if(smallest>arr[i]){
    smallest=arr[i];
   }
}
for(int i=0; i<arr.length; i++){
    if(smallest<arr[i]  && secondsmallest>arr[i]){
     secondsmallest=arr[i];
    }
 }

 for(int i=0; i<arr.length; i++){
    if(secondsmallest<arr[i]  && thirdsmallest>arr[i]){
     thirdsmallest=arr[i];
    }
 }
System.out.println(smallest);
System.out.println(secondsmallest);
System.out.println(thirdsmallest);
}
    
    public static void main(String[] args) {
          //WAP to find three smallest number
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,1,5,8}; 
         findThree(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
