public class LC1823 {
    // Josephus Problem
    static int solve(int n, int k){
        // Base Case
        if (n == 1) return 0;  // Add 1 for 1-modulo ans
        return (solve(n-1,k) + k) % n;
    }
    static int findWinner(int n, int k){
        return solve(n,k) + 1; // 1 modulo
    }
    public static void main(String[] args) {
        System.out.println(findWinner(5,2));
        System.out.println(findWinner(6,5));
    }
}
