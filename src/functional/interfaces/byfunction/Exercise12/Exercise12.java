package functional.interfaces.byfunction;

import java.util.function.Function;
import java.util.function.Predicate;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {
        Integer n = 2;
        Integer m = 4;



        Predicate<Integer, Integer> greaterNumber = (x, y) -> Integer.compare(x, y);
    }
}
