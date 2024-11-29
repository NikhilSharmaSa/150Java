public class Program113 {

    public static void PrimeorNot(int[] arr){

for(int i=0; i<arr.length; i++){
    int count=0;
 for(int j=2; j<=(int)Math.sqrt(arr[i]); j++){
    if(arr[i]%j==0){
count++;
System.out.println("The number "+ arr[i]+" is not Prime");
break;
    }
 }

 if(count==0){
    System.out.println("The number "+ arr[i]+" is Prime");
 }
    }
}

    public static void main(String[] args) {
          //WAP to check array elements are prime or not
           int[] arr={1,2,3,4,5,88,13,16,15,120,77,79};
           PrimeorNot(arr);
           


    }
}
