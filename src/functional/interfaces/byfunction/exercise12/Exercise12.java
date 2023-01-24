package functional.interfaces.byfunction.exercise12;

import java.util.function.Function;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {

    public static void main(String[] args) {
        CompareTwoNumbers comparator = new CompareTwoNumbers();
        System.out.println("Is 4 smaller than 33?: " + comparator.test(4,33));
        System.out.println("Is 23 smaller than 1?: " + comparator.test(23,1));
    }
}
