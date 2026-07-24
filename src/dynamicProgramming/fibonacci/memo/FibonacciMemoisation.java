package dynamicProgramming.fibonacci.memo;
import java.util.Arrays;
public class FibonacciMemoisation {
    public static int fib(int n, int[] dp){
        if (n <= 1) return n;
        // Step 2: If you have the value, don't calculate again, just return it
        if (dp[n] != -1){
            return dp[n];
        }
        // Step 3: if you don't have it, calculate it
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 8;
        // Step 1: Create a dp array of size n + 1
        // Fill it will all (-1)
        int[] dp = new int[n+1]; // 0-based indexing
        Arrays.fill(dp, -1); // Fill with default -1 values
        System.out.println("The fibonacci number at " + n + " is " +
                fib(n, dp));
    }
}
