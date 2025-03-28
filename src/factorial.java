/*
 * This method find factorial of number
 * The method uses recursion
 * The time complexity of the code is O(n)
 * resulting in linear time complexity
 */
public class factorial {
    public static int findFactorial(int n){
        return n==0?1:n*findFactorial(n-1);
    }
}
