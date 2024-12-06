
public class Program132 {
    public static int[] deleteElement(int[] arr,int key){
       int index=0;
        int arr2[]= new int[arr.length-1];
for(int i=0; i<arr.length; i++){
if(arr[i]==key){
    index=i;
}
  }

for(int i=0; i<index; i++){
    arr2[i]=arr[i];
}

for(int i=index+1; i<arr.length; i++){
    arr2[i-1]=arr[i];
}
return arr2;
}


    public static void main(String[] args) {
          //WAP to delete an element from array
                     int[] arr={-12,2,88,4,5,4,5,6,4,5,44,1,5,8};  
                     int key=88;      
        int arr3[]= deleteElement(arr,key);
         for (int i : arr3) {
            System.out.print(i+" ");
         }

        
        

    }
}
