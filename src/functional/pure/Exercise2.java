package functional.pure;

/*
* Create a simple calculator class that implements basic mathematical operations (addition, subtraction, multiplication, division) using pure functions.
* Each function should take two arguments and return the result of the operation without modifying any external state. Use “final” keyword to prevent reassignment
* of variables. Test the class by creating instances of it and calling the methods with different inputs, making sure that the results are correct and the state of
* the class doesn't change.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 calculator = new Exercise2();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(1, 2));
    }
    public double add (double a, double b) {
        return a + b;
    }
    public double subtract (double a, double b) {
        return a - b;
    }
    public double multiply (double a, double b) {
        return a * b;
    }
    public double divide (double a, double b) {
        return a / b;
    }

}
