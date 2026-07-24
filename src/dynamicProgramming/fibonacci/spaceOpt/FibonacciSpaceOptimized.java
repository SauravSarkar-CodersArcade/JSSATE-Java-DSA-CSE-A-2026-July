package dynamicProgramming.fibonacci.spaceOpt;
public class FibonacciSpaceOptimized {
    public static int fib(int n){
        int p2 = 0, p1 = 1;
        if (n == 0) return p2;
        if (n == 1) return p1;
        for (int i=2; i<=n; i++){
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The fibonacci number at " + n + " is " +
                fib(n));
    }
}
