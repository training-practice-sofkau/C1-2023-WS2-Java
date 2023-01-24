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
        System.out.println("The sum result is: "+calculator.add(3,4));
        System.out.println("The subtraction result is: "+calculator.subtract(5, 6));
        System.out.println("The multiplication result is: "+calculator.multiply(7,8));
        System.out.println("The division result is: "+calculator.divide(9.0,10.0));

    }
}
