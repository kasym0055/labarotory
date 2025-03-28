/*
 * This method find a power of b
 * * The method uses recursion
 * The time complexity of the code is O(log(b))
 * resulting in logarithm Time Complexity
 */
public class Power {
    public static int power(int a, int b){
        if(b==1) return a;
        return a*power(a,b-1);
    }
}
