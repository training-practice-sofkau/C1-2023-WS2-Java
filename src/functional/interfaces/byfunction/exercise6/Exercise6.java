package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;

/*
* Data Generator
Create a class that generates random data of a given type using a Supplier<String/Integer>: Two clases per one supplier
* Use the get method of the Supplier interface to generate the data. Test the class by passing different Supplier
* implementations that generate different types of data
*/
public class Exercise6 {
    public static void main(String[] args) {

        IntegerGenerator k = new IntegerGenerator();
        System.out.println(k.get());

        StringGenerator k2 = new StringGenerator();
        System.out.println(k2.get());


    }
}
