package functional.recursion;

public class Fibonacci {
    //Started numbers: 0 & 1

    public static int calculateFibo(int n){
        if( n == 0 ) {
            return 0;
        } else if ( n == 1) {
            return 1;
        }
        else {
            return (calculateFibo(n-1) + calculateFibo(n-2));
        }
    }
}
