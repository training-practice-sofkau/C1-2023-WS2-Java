package functional.interfaces.byfunction.exercise11;

public class NumberComparison implements Comparable<Integer, Integer, Boolean>{
    @Override
    public Boolean apply(Integer integer, Integer integer2) {
        return (integer>integer2);
    }
}
