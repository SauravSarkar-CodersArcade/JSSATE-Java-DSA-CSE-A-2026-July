package arrays;
import java.util.Arrays;
public class DifferenceSum {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n]; // 0 0 0 0 0
        int l = 1;
        int r = 3;
        int val = 10;
        diff[l] += val;
        // Check if the data is inbound or outbound
        if (r + 1 < n) diff[r+1] -= val; // 0 10 0 0 -10
        // Now do the prefix sum
        int[] result = new int[n]; // 0 0 0 0 0
        result[0] = diff[0];
        for (int i=1; i<n; i++){
             result[i] = result[i-1] + diff[i]; // 0 10 10 10 0
        }
        System.out.println(Arrays.toString(result));
    }
}
