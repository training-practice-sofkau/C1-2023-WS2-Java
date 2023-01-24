package functional.recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0) return true;
        //TO-DO:  Implement the recursion dynamic to follow in order to check is the word is a palindrome
        if(s.toLowerCase().charAt(0)==s.toLowerCase().charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;

    }
}
