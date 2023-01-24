package functional.interfaces.byfunction.exercise6;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    @Override
    public String get() {
        //TO-DO: The logic in order to show a random string
        int aLimit = 97;
        int zlimit = 122;
        int strLenght = 6;
        String finalStri="";
        Random random = new Random();
        for (int i=0; i<=strLenght; i++){
            int l = random.nextInt()*(aLimit-zlimit);
            char let = (char) l;
            finalStri += let;
        }

        return finalStri;
    }

}
