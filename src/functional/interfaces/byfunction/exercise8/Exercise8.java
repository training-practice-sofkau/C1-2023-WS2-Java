package functional.interfaces.byfunction.exercise8;

/*
*  Transformation
Create a class that transforms a list of elements from one type to another using a Function<T, R>.
* Use the apply method of the Function interface to transform each element. Test the class by passing different
* Function implementations that perform different types of transformations.
*/
public class Exercise8 {
    public static void main(String[] args){
        String[] list1 = {"1", "4", "6", "0"};
        Integer[] list = {1,5,6844,98,56,41};

        FromIntegerToString v1 = new FromIntegerToString();
        for (Integer i: list
             ) {
            System.out.println(v1.apply(i).getClass());
        }

        FromStringToInteger v2 = new FromStringToInteger();
        for (String i: list1
        ) {
            System.out.println(v2.apply(i).getClass());
        }

    }
}
