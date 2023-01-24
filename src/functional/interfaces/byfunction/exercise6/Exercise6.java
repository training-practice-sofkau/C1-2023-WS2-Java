package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;
import java.util.Random;

/*
* Data Generator
Create a class that generates random data of a given type using a Supplier<String/Integer>: Two clases per one supplier
* Use the get method of the Supplier interface to generate the data. Test the class by passing different Supplier
* implementations that generate different types of data
*/
public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("This is a random string: " + generateString());
        System.out.println("This is a random string: " + generateString());
        System.out.println("This is a random string: " + generateString());
        System.out.println("This is a random string: " + generateString());
        System.out.println("This is a random string: " + generateString());

        System.out.println("This is a random integer: " + generateInteger());
        System.out.println("This is a random integer: " + generateInteger());
        System.out.println("This is a random integer: " + generateInteger());
        System.out.println("This is a random integer: " + generateInteger());
        System.out.println("This is a random integer: " + generateInteger());

    }

    // Suppliers for random generations
    public static String generateString() {
        Supplier<String> stringGenerator = () -> randomString();
        return stringGenerator.get();
    }

    public static Integer generateInteger() {
        Supplier<Integer> integerGenerator = () -> randomInteger();
        return integerGenerator.get();
    }

    // Methods for random Suppliers
    public static Integer randomInteger() {

        Random randInt = new Random();
        randInt.setSeed(System.currentTimeMillis());
        return randInt.nextInt(4880);
    }
    public static String randomString() {

        Random rand = new Random();

        return rand.ints(48, 123).filter(num -> (num<58 || num>64) && (num<91 || num>96))
                .limit(15).mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append).toString();
    }
}