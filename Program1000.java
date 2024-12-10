public class Program1000 {

    public static void rotate(int[] arr, int k) {
        //Roatate an array according to the k
  int temp=arr[0];
for(int j=arr.length-k; j<arr.length; j++){


        arr[0]=arr[j];
for(int i=0;i<arr.length-1; i++){
    int second_temp=arr[i+1];
    arr[i+1]=temp;
    temp=second_temp;
}
}

        

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
    }
}
