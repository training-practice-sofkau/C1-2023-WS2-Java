package functional.recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0) return true;

        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            isPalindrome(s.substring(1, s.length() -  1));
            return true;
        }
        return false;
    }
}
