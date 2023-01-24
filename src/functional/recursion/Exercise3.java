package functional.recursion;

/*
* Create a function that calculates the nth Fibonacci number using recursion. The function should take an integer as an argument and return the nth Fibonacci number.
* Use the “final” keyword to prevent reassignment of variables. Test the function by calling it with different inputs, make sure that the results are correct.
 */
public class Exercise3 {
    public int calculateFibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.calculateFibonacci(10));
    }

}
