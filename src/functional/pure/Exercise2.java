package functional.pure;

/*
* Create a simple calculator class that implements basic mathematical operations (addition, subtraction, multiplication, division) using pure functions.
* Each function should take two arguments and return the result of the operation without modifying any external state. Use “final” keyword to prevent reassignment
* of variables. Test the class by creating instances of it and calling the methods with different inputs, making sure that the results are correct and the state of
* the class doesn't change.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int x = 3;
        int y = 4;

        System.out.println("Add: " + calculator.add(x,y));
        System.out.println("Subtract: " + calculator.subtract(x,y));
        System.out.println("Multiply: " + calculator.multiply(x,y));
        System.out.println("Divide: " + calculator.divide(x,y));
    }
}
