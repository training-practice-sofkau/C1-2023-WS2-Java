package functional.interfaces.custom;

import java.util.ArrayList;
import java.util.Collections;
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

        List<Book> myBooks = new ArrayList<>(){{
            add(new Book("Harry Potter",1999));
            add(new Book("Mi historia",2018));
            add(new Book("La hojarasca",1955));
            add(new Book("The Man in the Brown Suit",1924));

        }
        };

        Comparison comp = new Comparison();

        System.out.println(comp.comparator(5,2));
        System.out.println(comp.comparator(2,99));

        myBooks.sort((o1,o2)->comp.comparator(o2.getYear(), o1.getYear()));

        System.out.println(myBooks);


    }
}
