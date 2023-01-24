package functional.interfaces.byfunction;

import java.util.function.Predicate;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise6<T> {
    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        Predicate<Integer> checkInteger = value -> value > 10;
        Predicate<Double> checkDouble = value -> value > 10;
        Predicate<String> checkString = value -> value.length() > 10;
        System.out.println(exercise6.checkValue(checkInteger, 8));
        System.out.println(exercise6.checkValue(checkDouble, 25.0));
        System.out.println(exercise6.checkValue(checkString, "123456789"));
    }
    boolean checkValue (Predicate<T> function, T value) {
        return function.test(value);
    }
}
