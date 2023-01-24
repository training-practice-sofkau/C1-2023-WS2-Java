package functional.interfaces.byfunction.exercise5;

import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {
    @Override
    public String get() {
        String stringNumber = "";
        for (int i = 0; i < 10; i++) {
            char currentChar = (char) Math.floor(Math.random() * 64);
            stringNumber = stringNumber + currentChar;
        }
        return stringNumber;
    }
}
