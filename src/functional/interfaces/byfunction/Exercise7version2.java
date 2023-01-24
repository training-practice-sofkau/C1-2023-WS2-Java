package functional.interfaces.byfunction;

import java.util.function.Function;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise7version2<T extends Number> implements Function<T, String> {

    @Override
    public String apply(T t) {
        return t.toString();
    }
    public static void main(String[] args) {

        Exercise7version2<Number> exercise7 = new Exercise7version2<>();
        System.out.println(exercise7.apply(10));
        System.out.println(exercise7.apply(10.0));
        System.out.println(exercise7.apply(12311231));

    }
}
