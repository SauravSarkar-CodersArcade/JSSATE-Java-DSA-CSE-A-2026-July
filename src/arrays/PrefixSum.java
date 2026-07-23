package arrays;
import java.util.Arrays;
public class PrefixSum {
    public static void main(String[] args) {
        String str = "JSS";
        System.out.println(str.length()); // Method str.length()
        int[] arr = {1,2,3,4};
        int[] prefix = new int[arr.length]; // arr.length -> property
        prefix[0] = arr[0]; // Adjustment
        for (int i=1; i< arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}
