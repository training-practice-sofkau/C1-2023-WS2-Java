package functional.interfaces.byfunction.Exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {
    public static void main(String[] args) {
        Filtering filt = new Filtering();
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer i : number) {
            if (filt.test(i)) {
                System.out.println(i + " is even");
            }
        else {System.out.println(i + " is odd");}
        }

    }

}
