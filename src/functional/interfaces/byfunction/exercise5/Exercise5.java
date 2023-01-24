package functional.interfaces.byfunction.exercise5;

/*
* Data Generator
Create a class that generates random data of a given type using a Supplier<String/Integer>: Two clases per one supplier
* Use the get method of the Supplier interface to generate the data. Test the class by passing different Supplier
* implementations that generate different types of data
*/
public class Exercise5 {
    public static void main(String[] args) {
        IntegerGenerator integerGenerator = new IntegerGenerator();
        System.out.println("Integer: "+integerGenerator.get());
        StringGenerator stringGenerator = new StringGenerator();
        System.out.println("String: "+stringGenerator.get());
    }
}
