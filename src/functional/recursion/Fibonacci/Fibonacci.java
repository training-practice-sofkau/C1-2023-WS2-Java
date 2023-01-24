package functional.recursion.Fibonacci;

public class Fibonacci {
    //Started numbers: 0 & 1

    public static int calculate(int n) {
        if (n <= 1) return n;
        //TO-DO: Implement the recursion dynamic to follow in order to show the fibonnaci series
        return calculate(n - 1) + calculate(n - 2);
    }
}







