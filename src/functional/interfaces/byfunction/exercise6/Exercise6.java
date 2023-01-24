package functional.interfaces.byfunction.exercise6;

/*
* Data Generator
Create a class that generates random data of a given type using a Supplier<String/Integer>: Two clases per one supplier
* Use the get method of the Supplier interface to generate the data. Test the class by passing different Supplier
* implementations that generate different types of data
*/
public class Exercise6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            IntegerGenerator random = new IntegerGenerator();
            int randomNum = random.get();
            System.out.println(randomNum);
        }

        for (int i = 0; i < 10; i++) {
            StringGenerator random = new StringGenerator();
            String randomStr = random.get();
            System.out.println(randomStr);
        }

    }
}
