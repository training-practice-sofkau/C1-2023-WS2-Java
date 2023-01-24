package functional.interfaces.byfunction.Exercise7;

import java.util.function.Predicate;

public class Filtering implements Predicate<Integer> {

    @Override
    public boolean test(Integer inte) {
        if (inte%2 == 0){
            return true;
        }
        else return false;
    }

}
