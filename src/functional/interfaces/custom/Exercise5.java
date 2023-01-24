package functional.interfaces.custom;
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

        Comparision com = new Comparision();

        Integer i1 = 4;
        Integer i2 = 8;
        Integer i3 = 8;

        System.out.println(com.comparator(i1, i2));
        System.out.println(com.comparator(i2, i1));
        System.out.println(com.comparator(i2, i3));

        String s1 = "Love";
        String s2 = "Animals";
        String s3 = "Bedroom";

        System.out.println(com.comparator(s1, s2));
        System.out.println(com.comparator(s2, s1));
        System.out.println(com.comparator(s2, s3));
    }
}
