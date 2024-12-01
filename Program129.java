
public class Program129 {
    public static void decresingArr(int[] arr){
for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j<arr.length; j++){  
 if(arr[i]<arr[j]){
    arr[i]+=arr[j];
    arr[j]=arr[i]-arr[j];
    arr[i]=arr[i]-arr[j];
 }
}
}

    }
    public static void main(String[] args) {
          //WAP to sort an array in decreasing order
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,1,5,8};
          
         decresingArr(arr);
         for (int i : arr) {
            System.out.print(i+" ");
         }

        


    }
}
