
public class Program119 {

    public static boolean findDuplicate(int[] arr,int key){

for(int i=0; i<arr.length; i++){
    if(arr[i]==key){
    return true;
    }
}
return false;
    }
    public static void main(String[] args) {
          //WAP to find Occurance of a particular number in an array
           int[] arr={-12,2,88,4,5,4,5,6,4,5,44,4,5,8};
           int key=181;
          boolean result= findDuplicate(arr,key);
          System.out.println(result);


    }
}
