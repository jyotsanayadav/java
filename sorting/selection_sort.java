import java.util.*;
public class selection_sort {
public static void selectionsort(int arr[]){
    int n = arr.length;
    for(int i=0;i<n-1;i++){  //i is for number of turns
        int min_index = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}
}