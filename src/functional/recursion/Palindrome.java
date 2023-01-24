package functional.recursion;

public class Palindrome {
    public boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0) return true;

        if(s.charAt(0)==s.charAt(s.length()-1)){
            String newS= s.substring(1,s.length()-1);
            System.out.println(newS);
            System.out.println(newS.length());
            isPalindrome(newS);
            return true;
        }

        return false;
    }
}
