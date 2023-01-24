package functional.recursion;

public class Fibonacci {
    //Started numbers: 0 & 1

    public static int calculate(final int n){

        if( n == 0 ) return 0;
        if( n == 1) return 1;

        //TO-DO: Implement the recursion dynamic to follow in order to show the fibonnaci serie
        return calculate(n-1) + calculate(n-2);
    }
}
