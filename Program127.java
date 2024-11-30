
public class Program127 {

    public static void reverseArr(int[] arr){
int last=arr.length-1;
for(int i=0; i<arr.length/2; i++){
    arr[i]+=arr[last];
    arr[last]=arr[i]-arr[last];
    arr[i]=arr[i]-arr[last];
last--;
}

    }
    public static void main(String[] args) {
          //WAP to reverse an array
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,4,5,8};
          
         reverseArr(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
