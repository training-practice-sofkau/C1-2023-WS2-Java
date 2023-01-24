package functional.interfaces.byfunction.composition;

import java.util.List;
import java.util.function.Function;

/*
* Write a program that takes a list of integers and uses function composition to square each number, then add 1 to the result,
* and finally take the square root of the result. Implement the three functions separately and use function composition to chain them together.
 */
public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,5,1,7,8,9,3,2);

        //First function: square a number
        Function<Integer, Double> square = n -> Math.pow(n,2);

        //Second function: add one
        Function<Double, Double> addOne = m -> m + 1;

        //Last function: square root
        Function<Double,Double> squareRoot = o -> Math.sqrt(o);
        Function<Double,Double> squareRootMR = Math::sqrt;

        //TO - DO: Do the combination
        //Hint: forEach() or for but the simply one
        for(int x: numbers){

            System.out.println(square.andThen(addOne).andThen(squareRootMR).apply(x));

        }

        //numbers.forEach();
    }
}
