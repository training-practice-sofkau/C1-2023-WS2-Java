package functional.interfaces.byfunction.Exercise12;

/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {
        Integer n = 2;
        Integer m = 4;

        NumberComparator<Integer> greaterNumber = (x, y) -> x > y;

        System.out.println(greaterNumber.test(n,m));
        System.out.println(greaterNumber.test(m,n));
    }
}
