package functional.interfaces.byfunction.exercise8;

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
        Converter conv = new Converter();
        List<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5"));

        Integer sum = 0;
        for (String i:numbers) {
            //Implementation of the functional interface
            Integer j = conv.str2Int.apply(i);
            sum=sum+j;
        }
        System.out.println("The sum of all the elements in the list is: " + sum);
    }
}
