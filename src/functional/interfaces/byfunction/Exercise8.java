package functional.interfaces.byfunction;

import java.util.ArrayList;
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
        List<String> strings = List.of("1", "2", "3", "4", "5", "6");

        List<Integer> numbers = new ArrayList<>();

        Function<String, Integer> stringIntegerFunction = Integer::parseInt;

        for (String str : strings) {
            numbers.add(stringIntegerFunction.apply(str));
        }

        System.out.println("Strings: " + strings + strings.get(0).getClass().getSimpleName());
        System.out.println("Numbers: " + numbers + numbers.get(0).getClass().getSimpleName());
    }
}
