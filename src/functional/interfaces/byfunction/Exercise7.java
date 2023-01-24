package functional.interfaces.byfunction;

import java.util.function.Function;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise7 {

    public static void main(String[] args) {
        Function<Integer, String> integerToStringFunction = T -> T.toString();
        Function<Double, String> doubleToStringFunction = T -> T.toString();
        Function<Byte, String> byteToStringFunction = T -> T.toString();
        System.out.println(integerToStringFunction.apply(12));
        System.out.println(doubleToStringFunction.apply(12.0));
        System.out.println(byteToStringFunction.apply(".".getBytes()[0]));

    }
}
