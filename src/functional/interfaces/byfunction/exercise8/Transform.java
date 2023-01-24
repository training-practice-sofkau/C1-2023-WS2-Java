package functional.interfaces.byfunction.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Transform {

    static TransformIntToString intToString = new TransformIntToString();
    static List<String> transform(List<Integer> integers){
        List<String> response = new ArrayList<>();
        integers.forEach( n -> {
            response.add(intToString.apply(n));
        });
        return response;
    }
}
