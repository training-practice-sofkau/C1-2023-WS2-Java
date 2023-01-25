package functional.interfaces.byfunction.exercise10;

@FunctionalInterface
public interface ModifyString<A, B, C, D> {
    //public String apply(String s1,Character c1,Character c2);

    public D apply (A a, B b, C c);
}
