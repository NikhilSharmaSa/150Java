
public class Program124 {

    public static int findLength(int[] arr){
int count=0; 
int average=0;
for (int i : arr) {
average+=i;
    count++;
}
return average/count;
    }
    public static void main(String[] args) {
          //WAP to find the average of arrays element
           int[] arr={1,2,3,4,5};
           
          int result= findLength(arr);
          System.out.println("The average of the  array elements is: "+result);


    }
}
