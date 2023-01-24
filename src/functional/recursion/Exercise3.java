package functional.recursion;

/*
* Create a function that calculates the nth Fibonacci number using recursion. The function should take an integer as an argument and return the nth Fibonacci number.
* Use the “final” keyword to prevent reassignment of variables. Test the function by calling it with different inputs, make sure that the results are correct.
 */
public class Exercise3 {


    public static void main(String[] args) {
        int fiboN1 = 4;
        int fiboN2= 6;
        System.out.println("The Fibonacci number "+fiboN1+ " is: "+Fibonacci.calculate(fiboN1));
        System.out.println("The Fibonacci number "+fiboN2+ " is: "+Fibonacci.calculate(fiboN2));

    }
}
