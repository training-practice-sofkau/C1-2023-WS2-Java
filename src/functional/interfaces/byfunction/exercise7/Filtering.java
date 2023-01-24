package functional.interfaces.byfunction.exercise7;

import java.util.function.Predicate;

public class Filtering implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
           if (integer % 2 == 0){
               System.out.println(integer);
           }
           return true;
    }
}
