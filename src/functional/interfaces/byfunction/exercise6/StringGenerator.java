package functional.interfaces.byfunction.exercise6;

import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    @Override
    public String get() {
        //Returns 3 letters
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        return String.valueOf(letters.charAt((int) (Math.random() * letters.length())))+
                letters.charAt((int) (Math.random() * letters.length())) +
                letters.charAt((int) (Math.random() * letters.length()));
    }
}
