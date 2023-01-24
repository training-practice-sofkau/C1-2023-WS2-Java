package functional.interfaces.byfunction;

import java.util.function.BiFunction;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {

    // Function that compares two integers using a functional approach
    BiFunction<Integer,Integer,Boolean> isGreater = (x, y) -> x > y;

    // Testing function

    System.out.println(isGreater.apply(1, 2));
    System.out.println(isGreater.apply(2, 1));
    System.out.println(isGreater.apply(1, 1));
    System.out.println(isGreater.apply(2, 2));
    System.out.println(isGreater.apply(-1, 1));
    System.out.println(isGreater.apply(1, -1));
    }
}
