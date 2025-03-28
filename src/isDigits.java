/*
 * This method find if input is digit or not
 * The time complexity of the code is O(n)
 * The loop iterates from 1 to s.length
 */
public class isDigits {
    public static String isDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return "No";
            }
        }
        return "Yes";
    }
}
