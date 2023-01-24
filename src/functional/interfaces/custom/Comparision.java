package functional.interfaces.custom;

import java.util.Objects;

public class Comparision implements CustomComparator{
    @Override
    public int comparator(Object o1, Object o2) {
        //TO-DO: Implement the neccesary logic to acomplish the assessment. Just consider String and Integer classses
        if (o1 instanceof String && o2 instanceof String){
            if(((String) o1).length() < ((String) o2).length()) return -1;
            if(((String) o1).length() > ((String) o2).length()) return 1;
        }else{
            if((int)o1 < (int)o2)return -1;
            if((int)o1 > (int)o2)return 1;
        }
        if(o1 == o2) return 0;
        return -2;
    }
}
