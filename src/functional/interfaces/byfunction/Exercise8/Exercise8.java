package functional.interfaces.byfunction.Exercise8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise8 {
    public static void main(String[] args) {
        Transformation t = new Transformation();
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
        List<Integer> list1 = new ArrayList<>();

        for (String element : list) {
            list1.add(t.transform.apply(element));
        }
        System.out.println("The string list " + list + " has been converted to Integer list: " + list1);
    }

}
