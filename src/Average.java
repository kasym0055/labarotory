/*
 * This method calculate the average of numbers
 * The time complexity of the code is O(n)
 * The loop iterates from 1 to n
 */
public class Average {
    public static float average(int n,int[] arr) {
        int res=0;
        for (int i = 0; i < n; i++) {
            res+=arr[i];
        }
        return (float) res /n;
    }
}
