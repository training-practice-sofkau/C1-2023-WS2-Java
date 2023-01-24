package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {
    int add(final int x, final int y) {
        return x + y;
    }
    int sub(final int x, final int y) {
        return x - y;
    }

    int multi(final int x, final int y) {
        return  x * y;
    }

    double div(final int x, final int y) {
        return  (double)x / (double)y;
    }
}
