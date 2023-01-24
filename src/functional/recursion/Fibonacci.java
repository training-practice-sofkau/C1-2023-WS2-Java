package functional.recursion;

public class Fibonacci {
    //Started numbers: 0 & 1

    public static int calculate(int n){
        if( n < 2 ) {
            return n;
        }
        int fibonacci = calculate(n - 1) + calculate(n - 2);
        return fibonacci;
    }
}
