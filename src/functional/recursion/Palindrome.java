package functional.recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0) return true;
        //TO-DO:  Implement the recursion dynamic to follow in order to check is the word is a palindrome
        char begin = s.charAt(0);
        char end = s.charAt(s.length()-1);
        String newS = null;
        if (begin==end){
            newS = s.substring(0);
            newS = s.substring(s.length()-1);
            return isPalindrome(newS);
        } else {
            return false;
        }

    }
}
