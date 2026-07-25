package dynamicProgramming.lcs.memo;
public class LCS {
    public static void main(String[] args) {
        String s1 = "stone";
        String s2 = "longest";
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        // Build the dp table
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                // If the characters match
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    // If mismatched, take the max of prev row, prev col
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);

                }
            }
        }
        System.out.println("LCS Length: " + dp[m][n]);
    }
}
