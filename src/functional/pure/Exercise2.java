package functional.pure;

/*
* Create a simple calculator class that implements basic mathematical operations (addition, subtraction, multiplication, division) using pure functions.
* Each function should take two arguments and return the result of the operation without modifying any external state. Use “final” keyword to prevent reassignment
* of variables. Test the class by creating instances of it and calling the methods with different inputs, making sure that the results are correct and the state of
* the class doesn't change.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int i = 3;
        int j = 5;

        System.out.println("Addition of " + i + " and " + j + " is equals to " +Calculator.add(i,j));
        System.out.println("Subtraction of " + i + " and " + j + " is equals to " +Calculator.subtract(i,j));
        System.out.println("Multiply of " + i + " and " + j + " is equals to " +Calculator.multiply(i,j));
        System.out.println("Divide of " + i + " and " + j + " is equals to " +Calculator.divide(i,j));
        try {
            System.out.println("Divide of " + i + " and " + 0 + " is equals to " +Calculator.divide(i,0));
        }catch (Exception e) {
            System.out.println(e);
        }




    }
}
