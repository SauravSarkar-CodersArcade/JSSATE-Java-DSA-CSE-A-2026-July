package dynamicProgramming.climbingStairs.rec;
public class ClimbingStairsRec {
    static int climbingStairs(int n){
        // Base case : If we are at dest [1] or least we need 2 step [1]
        if (n == 0 || n == 1) return 1;
        return climbingStairs(n-1) + climbingStairs(n-2);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println("Number of ways for n = " + n + " is " +
                climbingStairs(n));
    }
}
