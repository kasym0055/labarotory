/*
 * This method find fibonacci of number
 * The method uses recursion
 * The time complexity of the code is O(2^n)
 * resulting in Exponential Time Complexity
 */
public class fibonacci {
    public static int fibonacciF(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacciF(n-1) + fibonacciF(n-2);
    }
}
