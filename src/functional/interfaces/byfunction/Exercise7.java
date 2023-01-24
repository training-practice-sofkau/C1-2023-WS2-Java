package functional.interfaces.byfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {

    static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
    static List<Integer> evenNumbers = new ArrayList<>();
    static List<Integer> oddNumbers = new ArrayList<>();

    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 == 1;

        // Testing the predicates
        for (int number : numbers){
            if (isEven.test(number)){
                evenNumbers.add(number);
            }
            if (isOdd.test(number)){
                oddNumbers.add(number);
            }
        }
        System.out.println("These are the even numbers: " + evenNumbers);
        System.out.println("These are the odd numbers: " + oddNumbers);
    }
}
