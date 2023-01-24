package functional.interfaces.custom;

@FunctionalInterface
public interface CustomComparator<T> {
    public int comparator(T o1,T o2);
}
