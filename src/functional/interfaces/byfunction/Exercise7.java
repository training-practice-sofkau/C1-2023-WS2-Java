package functional.interfaces.byfunction;

import java.util.List;
import java.util.function.Predicate;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        for (Integer number : numbers) {
            if(isEven.test(number)){
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        }
    }
}
