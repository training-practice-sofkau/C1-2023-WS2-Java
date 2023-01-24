package functional.interfaces.byfunction.Exercise12;

@FunctionalInterface
public interface NumberComparator<Integer> {
    boolean test(Integer i1, Integer i2);
}
