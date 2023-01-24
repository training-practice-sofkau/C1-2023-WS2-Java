package functional.interfaces.custom;

import java.util.List;

/*
* Create a custom functional interface that represents a comparison between two objects of the same type.
* The interface should have a single abstract method that takes two objects of the same type and returns an integer,
* where the result is negative if the first object is considered less than the second, zero if they are considered equal,
* and positive if the first object is considered greater than the second. Use @FunctionalInterface annotation to mark the
* interface as a functional interface. Create a class that implements this interface and test it by using it as a comparator
* for different types of objects, for example, strings, integers, and custom objects. Use the custom comparator in a functional way,
* for example, to sort a list of objects, or to find the minimum or maximum element in a collection.
 */
public class Exercise5 {
    public static void main(String[] args) {

        // Some data example
        List<String> strings = List.of("short","Longer string", "Another string", "Just another string");
        List<Integer> numbers = List.of(1, 4, 666, 955, 4555, 22, 555);


        //Creating some objects
        String string1 = "short";
        String string2 = "Longer string";
        Integer integer1 = 5;
        Integer integer2 = 4;

        //Testing the comparison
        Comparison comparator = new Comparison();
        System.out.println(comparator.compare(string1, string2));
        System.out.println(comparator.compare(integer1, integer2));

        // Sorting Lists of Objects
        String maxString = "";
        for(String string : strings){
            if (comparator.compare(string, maxString) > 0){
                maxString = string;
            }
        }

        Integer maxInteger = 0;
        for(Integer number : numbers){
            if(comparator.compare(number, maxInteger) < 0){
                maxInteger = number;
            }
        }

        // Greater values
        System.out.println("The longest string is: " + maxString);
        System.out.println("The largest number is: " + maxInteger);

    }
}
