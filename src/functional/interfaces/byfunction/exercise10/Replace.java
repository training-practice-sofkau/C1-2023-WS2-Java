package functional.interfaces.byfunction.exercise10;

public class Replace implements Replacer{

    @Override
    public String replacer(String n, String o, String s) {
        return s.replace(o,n);
    }
}
