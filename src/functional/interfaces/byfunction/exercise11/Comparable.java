package functional.interfaces.byfunction.exercise11;

@FunctionalInterface
public interface Comparable <T, S, M>{
    public M apply (T t, S s);
}
