package functional.interfaces.byfunction;

import java.util.List;
import java.util.function.Function;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise8 {
    public static void main(String[] args) {

        // List of elements
        List<String> strings = List.of("1", "73", "933", "102", "133");
        List<Integer> integers = List.of(2,3,5,1,7,8,9,3,2);
        List<Double> doubles = List.of(1.34, 2.2, 3.3, 4.4, 5.8);

        // Functions to transform each element
        Function<Integer, String> intToString = x -> Integer.toString(x);
        Function<String, Integer> stringToInt = x -> Integer.parseInt(x);
        Function<Double, Integer> doubleToInt = x ->  (int) Math.round(x);

        //Testing the functions
        for (String element : strings) {
            System.out.println(stringToInt.apply(element).getClass());
        }

        for (Integer element : integers) {
            System.out.println(intToString.apply(element).getClass());
        }

        for (Double element : doubles) {
            System.out.println(doubleToInt.apply(element).getClass());
        }
    }
}
