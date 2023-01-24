package functional.interfaces.custom;

public class Comparator implements CustomComparator{
    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(o1.toString().length(), o2.toString().length());
    }

    public int compare(int o1, int o2) {
        return Integer.compare(o1, o2);
    }
    public int compare(double o1, double o2) {
        return Double.compare(o1, o2);
    }
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
