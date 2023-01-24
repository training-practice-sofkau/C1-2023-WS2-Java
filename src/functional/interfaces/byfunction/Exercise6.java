package functional.interfaces.byfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise6<T> {
    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        Predicate<Integer> checkInteger = value -> value > 3;
        Predicate<Double> checkDouble = value -> value > 3;
        Predicate<String> checkString = value -> value.length() > 3;
        List<Integer> integerList = List.of(1,2,3,4,5,6);
        List<Double> doubleList = List.of(1.0,2.0,3.0,4.0,5.0,6.0);
        List<String> stringList = List.of("1","12","123","1234","12345","123456");
        System.out.println("Filter of the integer list:");
        integerList.stream().filter(value -> exercise6.checkValue(checkInteger, value)).toList().forEach(System.out::println);
        System.out.println("Filter of the double list:");
        doubleList.stream().filter(value -> exercise6.checkValue(checkDouble, value)).toList().forEach(System.out::println);
        System.out.println("Filter of the string list:");
        stringList.stream().filter(value -> exercise6.checkValue(checkString, value)).toList().forEach(System.out::println);

    }
    boolean checkValue (Predicate<T> function, T value) {
        return function.test(value);
    }
}
