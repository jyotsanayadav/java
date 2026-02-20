public class subarrays {
    //subarray means a contiguous part of an array
    //choose a number, choose another number after it, and print all the elements in between
    public static void printSubarrays(int numbers[]) {
        //outer loop for starting point
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            //inner loop for ending point
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                //print subarray from numbers[i] to numbers[j]
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " "); //subarray
                }
                System.out.println();
            }
        }
    }
}
// for total number of subarrays = n*(n+1)/2 where n is the size of the array
//time complexity = O(n^3) because of 3 nested loops