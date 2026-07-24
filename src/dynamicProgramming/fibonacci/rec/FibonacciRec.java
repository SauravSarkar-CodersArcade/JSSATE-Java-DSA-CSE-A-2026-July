package dynamicProgramming.fibonacci.rec;
public class FibonacciRec {
    public static int fib(int n){
        // Base
        if (n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The fibonacci number at " + n + " is " +
                fib(n));
    }
}
