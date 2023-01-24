package functional.interfaces.byfunction.exercise8;

import java.util.List;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,4,65,2,121,54,7,7);
        System.out.println("Converting integer list: " + integers + " \nInto a String list: " + Transform.transform(integers));
    }
}
