package arrays;
public class MaxSumSubArrayFixedWindow {
    public static int findMaxSum(int[] arr, int k){
        int windowSum = 0, maxSum = 0;
        for (int i=0; i<k; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i=k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k]; // Take current & skip last from previous window
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println("Maximum Sum: " + findMaxSum(arr, k));
    }
}
