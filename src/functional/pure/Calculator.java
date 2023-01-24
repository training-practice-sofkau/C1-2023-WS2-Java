package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {

    //Addition
    public static int add(final int x, final int y){
        return  x + y;
    }

    //TO-DO: The other operations
    public static int subtract(final int x, final int y) { return x - y; }

    public static int multiply(final int x, final int y) { return x * y; }

    public static double divide(final int x, final int y) {
        if(y == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double)x / y;
    }
}
