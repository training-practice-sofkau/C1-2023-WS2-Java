package functional.interfaces.byfunction.exercise7;

import java.util.List;
import java.util.function.Supplier;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {
    public static void main (String [] args){
        String[] list1 = {"Java", "Python", "PHP", "C++"};
        Integer[] list2 = {548, 569, 52454, 658, 1};
        ListFilterString stringfilter=new ListFilterString();
        ListFilterInteger integerfilter=new ListFilterInteger();
        for (String i: list1
             ) {
            System.out.println(stringfilter.test(i));
        }
        for (Integer i: list2
        ) {
            System.out.println(integerfilter.test(i));
        }
    }
}
