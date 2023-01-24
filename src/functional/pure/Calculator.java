package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {

    //Addition
    public int add(final int x, final int y){
        return  x + y;
    }

    //Substraction
    public int sustraction(final int x, final int y) {return x-y;}

    //Multiplication
    public int multiplication(final int x, final int y) {return x*y;}

    //Division
    public int division(final int x, final int y) {
        try{
            int z = x/y;
        } catch (Exception e){
            System.out.println(e);
        }
        return x/y;
    }
}
