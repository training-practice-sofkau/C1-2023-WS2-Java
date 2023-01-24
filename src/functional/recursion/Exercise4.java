package functional.recursion;

/*
 * Create a function that checks if a string is a palindrome using recursion. The function should take a string as an argument and return a boolean indicating whether
 * the string is a palindrome. Use the charAt method to access the individual characters of the string and the substring method to extract substrings.
 */
public class Exercise4 {

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("12111111111111111111111111111111111111111111121"));
    }

}
