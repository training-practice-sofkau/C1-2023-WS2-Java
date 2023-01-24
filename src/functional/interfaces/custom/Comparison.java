package functional.interfaces.custom;

public class Comparison implements CustomComparator{
    @Override
    public int compare(Object o1, Object o2) {
        int value = 0;
        if (o1.getClass() == Integer.class && o2.getClass() == Integer.class) {

            value = ((Integer) o2).compareTo(((Integer) o1).intValue());
        }

        if (o1.getClass() == String.class && o2.getClass() == String.class) {
            if (o1.equals(o2)) {
                value = 0;
            }
            if (((String) o1).length() < ((String) o2).length()) {
                value = -1;
            }
            if (((String) o1).length() > ((String) o2).length()) {
                value = 1;
            }
        }
        return value;
    }
}
