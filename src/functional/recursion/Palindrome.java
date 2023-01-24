package functional.recursion;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return true;
        }

        if (str.toLowerCase().charAt(0) != str.toLowerCase().charAt(str.length() - 1)) {
            return false;
        } else{
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
}
