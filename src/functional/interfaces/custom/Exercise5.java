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
        Comparision comparision = new Comparision();
        System.out.println(comparision.comparator(1,2));
        System.out.println(comparision.comparator(1,1));
        System.out.println(comparision.comparator(2,1));

        System.out.println(comparision.comparator("oso", "osa"));
        System.out.println(comparision.comparator("oso","mogolla"));
        System.out.println(comparision.comparator("pedro", "palo"));
    }
}
