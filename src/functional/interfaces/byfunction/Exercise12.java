package functional.interfaces.byfunction;
/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(compareInt(10, 2));
    }

    public static boolean compareInt(final int x, final int y){
        return x > y;
    }
}
