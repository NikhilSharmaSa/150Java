
public class Program126 {

    public static void copyArr(int[] arr,int[] arr2){
int count=0; 
for (int i : arr) {
    if(i%2==0){
        arr2[count]=i;
        count++;
    }
   
}

    }
    public static void main(String[] args) {
          //WAP to copy one array elements into another array
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,4,5,8};
           int [] arr2= new int[14];
         copyArr(arr,arr2);
         for (int i : arr2) {
            System.out.print(i+" ");
         }

        


    }
}
