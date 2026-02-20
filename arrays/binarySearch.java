import java.util.*;
public class binarySearch {
    //like dictionary search- sorted array
    // start from middle element
    // if key==middle -> found
    // if key < middle -> search in left half , end=mid-1
    // if key > middle -> search in right half, start=mid+1
    public static int binarySearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(key < numbers [mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1; // not found
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        int index=binarySearch(numbers,key);
        if(index==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
