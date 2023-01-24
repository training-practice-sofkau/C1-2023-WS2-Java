package functional.pure;

//Remember: The result in this exercise is to apply purity
public class Calculator {
    public int add(final int x, final int y) {
        return x + y;
    }
    public int sub(final int x, final int y) {
        return x - y;
    }

    public int multi(final int x, final int y) {
        return  x * y;
    }

    public double div(final int x, final int y) {
        return  (double)x / (double)y;
    }
}
