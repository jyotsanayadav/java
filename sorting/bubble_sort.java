import java.util.*;
public class bubble_sort {
public static void bubblesort(int arr[]){
    int n = arr.length;
    for(int i=0;i<n-1;i++){  //i is for number of turns
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    bubblesort(arr);
    System.out.println("Sorted array: "+Arrays.toString(arr));
}
//Time complexity: O(n^2) in worst and average case, O(n) in best case (when the array is already sorted)
//Space complexity: O(1) as it is an in-place sorting algorithm