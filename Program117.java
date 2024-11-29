
public class Program117 {

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
           int key=4;
           int result=findOccurance(arr,key);
           System.out.println("The occurance of the number "+key+ " is: "+result);


    }
}
