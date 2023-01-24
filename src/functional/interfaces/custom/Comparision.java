package functional.interfaces.custom;

public class Comparision implements CustomComparator{
    @Override
    public int comparator(Object o1, Object o2) {
        //TO-DO: Implement the neccesary logic to acomplish the assessment. Just consider String and Integer classses

        if ((o1.getClass().equals(o2.getClass()))
                && ((o1.getClass().equals(Integer.class)
                && o1.getClass().equals(Integer.class)))) {

            if (((Integer) o1).intValue()
                    > ((Integer) o2).intValue()) return 1;
            else if (((Integer) o1).intValue()
                    < ((Integer) o2).intValue()) return -1;

        }        //if (o1.getClass()==String.class) return 1;

        if ((o1.getClass().equals(o2.getClass()))
                && ((o1.getClass().equals(String.class)
                && o1.getClass().equals(String.class)))) {
            if (((((String) o1).length()==
                    ((String) o2).length()))) return 0;
            else if (((((String) o1).length()>
                    ((String) o2).length()))) return 1;
            else if (((((String) o1).length()<
                    ((String) o2).length()))) return -1;
        }
        return 0;
    }
}
