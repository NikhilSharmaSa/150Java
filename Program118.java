
public class Program118 {

    public static int findOccurance(int[] arr,int key){
int count=0;
for(int i=0; i<arr.length; i++){
    if(arr[i]==key){
    count++;
    }
}
return count;
    }
    public static void main(String[] args) {
          //WAP to find Occurance of a particular number in an array
           int[] arr={-12,2,88,4,5,4,5,6,4,5,44,4,5,8};
          for(int i=0;i<arr.length; i++){
            int result=findOccurance(arr,arr[i]);
            System.out.println("The occurance of the number "+arr[i]+ " is: "+result);
          }
      


    }
}
