package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {

    //Addition
    public int add(final int x, final int y){
        return  x + y;
    }

    //Substraction
    public int subtract(final int x, final int y){
        return  x - y;
    }

    //Multiplication
    public int multiply(final int x, final int y){
        return  x * y;
    }

    //Division
    public double divide(final int x, final int y){
        return  (double)x / (double)y;
    }


}
