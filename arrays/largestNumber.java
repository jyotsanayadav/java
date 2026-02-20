import java.util.*;
public class largestNumber {
    // - infinity- smaallest in java- Integer.MIN_VALUE
    // + infinity- largest in java- Integer.MAX_VALUE
    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE; //-infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
        public static void main(String args[]){
            int numbers[]={3,5,7,2,8,6,4};
            System.out.println("Largest number is: " + getLargest(numbers));
        }
}
}
