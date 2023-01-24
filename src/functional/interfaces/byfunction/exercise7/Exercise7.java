package functional.interfaces.byfunction.exercise7;

/*Filtering
Create a class that filters a list of elements using a Predicate<T>. Use the test method of the Predicate interface to check if each element satisfies
a certain condition. Test the class by passing different Predicate implementations that filter the elements in different ways.
*/
public class Exercise7 {
    public static void main(String[] args) {
        Filter even = new Filter();
        System.out.println("Is 3 a par?: " + even.test(3));
        System.out.println("Is 12 a par?: " + even.test(12));
        System.out.println("Is 55 a par?: " + even.test(55));
    }

}
