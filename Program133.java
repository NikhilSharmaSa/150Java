
public class Program133 {
    public static int[] insertElement(int[] arr,int key,int index){
      
        int arr2[]= new int[arr.length+1];


        for(int i=0; i<=index; i++){
            if(i==index){
                arr2[i]=key;
            }else{
                arr2[i]=arr[i];
            }
           
        }

        for(int i=index+1; i<arr2.length; i++){
            arr2[i]=arr[i-1];
        }



return arr2;
}


    public static void main(String[] args) {
          //WAP to insert an element at given index
                     int[] arr={38,36,40,34,33,32,12};  
                     int key=35;
                     int index=3;      
        int arr3[]= insertElement(arr,key,index);
         for (int i : arr3) {
            System.out.print(i+" ");
         }

        
        

    }
}
