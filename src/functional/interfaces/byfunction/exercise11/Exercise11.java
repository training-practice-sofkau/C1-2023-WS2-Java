package functional.interfaces.byfunction.exercise11;
/*
* Number Comparison
Create a function that compares two integers using a functional approach. The function should take two integers as arguments,
* and return a boolean indicating whether the first integer is greater than the second. Use the > operator to compare the two input integers.
*/
public class Exercise11 implements intComparator {
    @Override
    public boolean compare(int i, int j) {
        return i>j;
    }

    public static void comparatorResult(intComparator comparator, int i, int j) {
        if(comparator.compare(i, j)){
            System.out.println(i + " is greater than " + j);
        }else{
            System.out.println(j + " is greater than " + i);
        }
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        comparatorResult((int iInt, int jInt)->iInt>jInt,i,j);
        Exercise11 exercise11 = new Exercise11();
        System.out.println("The statement: '"+i+" is grater than "+j+"' is "+exercise11.compare(i, j));
    }
}
