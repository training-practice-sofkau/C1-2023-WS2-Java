package functional.interfaces.byfunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Boolean> checkFirstGreater = (x,y) -> {
            return x > y;
        };

        System.out.println(checkFirstGreater.apply(8,5));
        System.out.println(checkFirstGreater.apply(5,5));
        System.out.println(checkFirstGreater.apply(2,5));
        System.out.println(checkFirstGreater.apply(0,-1));

    }
}
