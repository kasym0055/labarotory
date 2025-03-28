/*
 * This method find binomial coefficient using the formula
 * The time complexity of the code is O(n)
 * The loop iterates from 1 to s.length
 *  * resulting in linear time complexity
 */
public class BinomalC {
    public static int binomalC(int n, int k) {
        return factorial.findFactorial(n-1)/(factorial.findFactorial(k-1)*factorial.findFactorial(n-k))
                +(factorial.findFactorial(n-1)/(factorial.findFactorial(n-k-1)*factorial.findFactorial(k)));
    }
}
