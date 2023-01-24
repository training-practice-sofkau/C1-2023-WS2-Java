package functional.interfaces.byfunction.Exercise10;

@FunctionalInterface
public interface StringReplacer<String> {
    String apply(String str, String charA, String charB);
}
