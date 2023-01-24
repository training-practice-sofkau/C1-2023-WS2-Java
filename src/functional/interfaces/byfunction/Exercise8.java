package functional.interfaces.byfunction;

import java.util.List;
import java.util.function.Function;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise8 {

    public static void main(String[] args) {

        List<String> myNums = List.of("1","5","9","17");

        Function<String,Integer> stringToInteger = Integer::parseInt;

        for(String n:myNums){

            System.out.println(stringToInteger.apply(n));

        }

    }


}
