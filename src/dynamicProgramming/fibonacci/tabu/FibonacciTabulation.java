package dynamicProgramming.fibonacci.tabu;
public class FibonacciTabulation {
    public static int fib(int n){
        if (n <= 1) return n;
        // Step 1: Create the dp[] of size n+1 [0-based indexing]
        int[] dp = new int[n+1];
        // Step 2: Store the known values in the dp array [Tabulation]
        dp[0] = 0;
        dp[1] = 1;
        // Step 3: Use a loop from 2 to the unknown n value
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The fibonacci number at " + n + " is " +
                fib(n));
    }
}
