package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {

    //Addition
    public int add(final int x, final int y){
        return  x + y;
    }

    //TO-DO: The other operations

    public int subtraction(final int x, final int y){
        return  x - y;
    }

    public int multiplication(final int x, final int y){
        return  x * y;
    }

    public int division(final int x, final int y){
        if(y==0) return x; //I decided to return dividend when divisor is zero
        return  x / y;
    }

}
