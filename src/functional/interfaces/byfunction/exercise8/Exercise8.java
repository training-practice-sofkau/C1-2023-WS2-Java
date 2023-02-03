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
        List<Integer> ages = List.of(17, 18, 19, 28, 18, 28, 46, 7, 8, 9, 21, 12);

        Transform.changeType(ages);

    }
}
