package functional.recursion;

/*
* Create a function that calculates the nth Fibonacci number using recursion. The function should take an integer as an argument and return the nth Fibonacci number.
* Use the “final” keyword to prevent reassignment of variables. Test the function by calling it with different inputs, make sure that the results are correct.
 */
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(Fibonacci.calculateFibo(1));

        System.out.println(Fibonacci.calculateFibo(25));

        System.out.println(Fibonacci.calculateFibo(12));

        System.out.println(Fibonacci.calculateFibo(5));

        System.out.println(Fibonacci.calculateFibo(0));
    }
}
