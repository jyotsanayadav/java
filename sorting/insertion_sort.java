java.util.*;
public class insertion_sort {
public static void insertionsort(int arr[]){
    int n = arr.length;
    for(int i=1;i<n;i++){  //i is for number of turns
        int key = arr[i];
        int j = i-1; //j is for comparing the key with the elements on the left side of the key
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    insertionsort(arr);
    System.out.println("Sorted array: "+Arrays.toString(arr));

}