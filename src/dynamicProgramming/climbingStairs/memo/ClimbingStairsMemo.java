package dynamicProgramming.climbingStairs.memo;
import java.util.Arrays;
public class ClimbingStairsMemo {
    static int climbingStairs(int n, int dp[]){
        // Base case : If we are at dest [1] or least we need 2 step [1]
        if (n == 0 || n == 1) return 1;
        // Step 2
        if (dp[n] != -1) return dp[n];
        // Step 3
        return dp[n] = climbingStairs(n-1, dp) + climbingStairs(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 3;
        // Step 1
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Number of ways for n = " + n + " is " +
                climbingStairs(n, dp));
    }
}
