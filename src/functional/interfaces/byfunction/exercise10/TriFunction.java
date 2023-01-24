package functional.interfaces.byfunction.exercise10;

@FunctionalInterface
public interface TriFunction<T, U, R, K> {

    R apply(T t, U u, R r);
}