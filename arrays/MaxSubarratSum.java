public class MaxSubarratSum {
    // brute force approach O(n^3)
    public static void maxSubArraySum(int numbers[]) { // in starting maxsum= -infinity
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
       for(int i=0;i<numbers.length;i++){
        int start=i;
           for(int j=i;j<numbers.length;j++){
            int end=j;
            currentSum=0;
            for(int k=start;k<=end;k++){
                currentSum+=numbers[k];
            }
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
           }
       }
         System.out.println("The maximum subarray sum is: " + maxSum);
}
}
