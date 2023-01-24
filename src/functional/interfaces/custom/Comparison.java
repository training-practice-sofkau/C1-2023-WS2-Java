package functional.interfaces.custom;

public class Comparison implements CustomComparator<Integer> {

    @Override
    public int comparator(Integer o1, Integer o2) {
        if (o1<o2) {
            return -1;
        } else if (o1> o2) {
            return 1;
        } else {
            return 0;
        }
    }
}
