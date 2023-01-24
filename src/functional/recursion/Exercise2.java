package functional.recursion;

/*
* Create a function that calculates the nth Fibonacci number using recursion. The function should take an integer as an argument and return the nth Fibonacci number.
* Use the “final” keyword to prevent reassignment of variables. Test the function by calling it with different inputs, make sure that the results are correct.
 */
public class Exercise2 {
    public int calculateFibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        System.out.println(exercise2.calculateFibonacci(10));
    }

}
