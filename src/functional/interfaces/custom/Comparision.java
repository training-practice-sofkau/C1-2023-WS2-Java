package functional.interfaces.custom;

import java.util.Objects;

public class Comparision implements CustomComparator{
    @Override
    public int comparator(Integer o1, Integer o2) {
            if (Objects.equals(o1, o2)){
                return  0;
            } else if (o1 > o2) {
                return  1;
            }else
                return  -1;

    }
}
