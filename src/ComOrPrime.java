/*
* This method determine is number prime or composite
* The time complexity of the code is O(1)
* The loop iterates from 1 to 9
*/
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
