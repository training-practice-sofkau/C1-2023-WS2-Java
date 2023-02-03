package functional.interfaces.byfunction.exercise8;

import java.util.List;
import java.util.function.Function;

public class Transform {
    public static void  changeType(List<Integer> list){
        for (Integer l:list) {
            Function<Integer, Integer> add = x -> x + 2;
            Function<Integer, String> func = Object::toString;
            Function<Integer, String> fin = add.andThen(func);
            String result = fin.apply(l);
            System.out.println(result);
        }

    }
}
