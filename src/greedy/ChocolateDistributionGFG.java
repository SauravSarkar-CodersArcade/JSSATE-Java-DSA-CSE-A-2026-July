package greedy;
import java.util.Arrays;
public class ChocolateDistributionGFG {
    public static int findMinDiff(int[] arr, int m){
        // Edge Cases
        if (m == 0 || arr.length < m){
            return 0; // Not possible
        }
        // Sort the array
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE; // Take a very large value
        // Sliding Window => Window Size [i + m - 1]
        for (int i=0; i+m-1 < arr.length; i++){
            int diff = arr[i+m-1] - arr[i];
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(findMinDiff(arr, m));

    }
}
