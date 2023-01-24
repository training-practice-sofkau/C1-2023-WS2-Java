package functional.interfaces.custom;

public class Comparision implements CustomComparator{
    @Override
    public int comparator(Object o1, Object o2) {
        //TO-DO: Implement the neccesary logic to acomplish the assessment. Just consider String and Integer classses
        int result = 0;
        if (o1.getClass() == o2.getClass()){
            //Compares the length of the strings
            if (o1 instanceof String){
                if (((String) o1).length()==((String) o2).length() ){
                    return 0;
                }
                if (((String) o1).length()>((String) o2).length() ){
                    return 1;
                }
                if (((String) o1).length()<((String) o2).length() ){
                    return -1;
                }

            }

            if (o1 instanceof Integer){
                if ((Integer)o1==(Integer)o2){
                    return 0;
                }
                if ((Integer)o1>(Integer)o2){
                    return 1;
                }
                if ((Integer)o1<(Integer)o2){
                    return -1;
                }
            }
        }
        return result;
    }
}
