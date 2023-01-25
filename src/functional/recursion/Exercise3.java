package functional.recursion;

/*
* Create a function that calculates the nth Fibonacci number using recursion. The function should take an integer as an argument and return the nth Fibonacci number.
* Use the “final” keyword to prevent reassignment of variables. Test the function by calling it with different inputs, make sure that the results are correct.
 */
public class Exercise3 {
    public static void main(String[] args) {
        // set position you want to know the value sequence
        int num = 20;
        for (int i = 0; i < num; i++) {
            System.out.println(Fibonacci.calculate(i));
        }
        int fib = Fibonacci.calculate(num);
        System.out.println(fib);
        System.out.println("Value in position " + num + " is: " + fib);
    }
}
