package functional.interfaces.byfunction;

import java.util.function.Function;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {
    boolean i = compare(2,3);
    System.out.println(i);
    }
    public static boolean compare(int a, int b) {
        if (a > b) return true;
        else return false;
    }
}
