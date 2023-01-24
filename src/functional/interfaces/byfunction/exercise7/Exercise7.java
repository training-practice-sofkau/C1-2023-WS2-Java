package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {

    public static void main(String[] args) {

        MyPredicate predicate = new MyPredicate();

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(7));
        System.out.println(predicate.test(33));
        System.out.println(predicate.test(16));

    }
}
