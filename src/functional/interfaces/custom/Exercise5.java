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
        Comparision comp = new Comparision();
        System.out.println("The result of comparing 5 and 5 is:");
        System.out.println(comp.comparator(5,5));
        System.out.println("The result of comparing 5 and 10 is:");
        System.out.println(comp.comparator(5,10));
        System.out.println("The result of comparing 10 and 5 is:");
        System.out.println(comp.comparator(10,5));
        System.out.println("The result of comparing 'Hi' and 'Hi' is:");
        System.out.println(comp.comparator("Hi","Hi"));
        System.out.println("The result of comparing 'Hi' and 'Hello' is:");
        System.out.println(comp.comparator("Hi","Hello"));
        System.out.println("The result of comparing 'Hello' and 'Hi' is:");
        System.out.println(comp.comparator("Hello","Hi"));

    }
}
