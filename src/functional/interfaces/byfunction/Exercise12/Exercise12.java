package functional.interfaces.byfunction.Exercise12;
/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise12 {
    public static void main(String[] args) {
        Comparator comp = new Comparator();
        System.out.println("10 is greater than 5: "+comp.apply(10,5));
        System.out.println("5 is greater than 10: "+comp.apply(5,10));
    }
}
