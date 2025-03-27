public class ComOrPrime {
    public static String findComOrPrime(int n) {
        int count=0;
        for (int i = 1; i < 10; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (n==1) return "Prime";
        if (count == 1 && n>10) {
            return "Prime";
        }
        else if (count == 2 && n<10) {
            return "Prime";
        }
        else {
            return "Composite";
        }
    }
}
