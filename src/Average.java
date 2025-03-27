public class Average {
    public static float average(int n,int[] arr) {
        int res=0;
        for (int i = 0; i < n; i++) {
            res+=arr[i];
        }
        return (float) res /n;
    }
}
