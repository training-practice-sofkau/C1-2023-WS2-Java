package functional.interfaces.byfunction.exercise10;

import java.util.function.Function;

public class StringReplacement implements
        ModifyString<String, Character, Character, String>{
    @Override
    public String apply(String s, Character a, Character b) {
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)==a){
                s = s.replace(s.charAt(i), b);
                break;
            }
        }
        return s;
    }
}
