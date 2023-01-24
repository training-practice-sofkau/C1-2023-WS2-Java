package functional.interfaces.byfunction.exercise12;

public class CompareTwoNumbers implements Comapre {
    @Override
    public boolean test(Integer a, Integer b) {
        return a < b;
    }
}
