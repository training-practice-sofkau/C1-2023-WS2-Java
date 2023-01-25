package functional.interfaces.byfunction.exercise11;

import java.util.function.Function;

/* Phonebook
* Create a class that implements a phonebook using a functional approach.
* The class should have methods for adding a contact, removing a contact, searching a contact, and listing all contacts.
* The methods should use functional interfaces such as Consumer<T>, Supplier<T>, Predicate<T> and Function<T, R>.
 */
public class Exercise11 {
   public static void main(String[] Args){
       NumberComparison num = new NumberComparison();
       System.out.println("is #1 greater than #2: " + num.apply(5, 4));
      System.out.println("is #1 greater than #2: " + num.apply(4, 5));
      System.out.println("is #1 greater than #2: " + num.apply(100, 1000));
   }
}
