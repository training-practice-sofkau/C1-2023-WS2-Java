package functional.recursion;

public class Palindrome {
    public static boolean isPalindrome(String s, int c, int f){

        if(c == 1) return true;
        //TO-DO:  Implement the recursion dynamic to follow in order to check is the word is a palindrome
        if ((s.charAt(c) != s.charAt(f))) {
            return false;
        }
        if (c < f + 1) return isPalindrome(s, c +1, f - 1);
        return true;
    }
    public static boolean isEmpty(String s){
        int l = s.length();
        if (l == 0) return true;
        return isPalindrome(s, 0, l-1);
    }
}
