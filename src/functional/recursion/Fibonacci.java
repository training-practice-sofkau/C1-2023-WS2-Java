package functional.recursion;

public class Fibonacci {
    //Started numbers: 0 & 1

    public static final int calculate(int n){
        if( n == 0 ) return 0;
        if( n == 1 || n == 2) return 1;

        return calculate(n-2)+ calculate(n-1);
    }
}
