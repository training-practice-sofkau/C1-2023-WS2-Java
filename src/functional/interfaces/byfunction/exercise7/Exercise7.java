package functional.interfaces.byfunction.exercise7;

import java.util.List;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> ages = List.of(17, 18, 19, 28, 18, 28, 46, 7, 8, 9, 21, 12);

        Filtering even = new Filtering();

        for (int i : ages) {
            even.test(i);
        }
    }
}
