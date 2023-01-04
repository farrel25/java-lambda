package farrel.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

         // Anonymous class version
        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };
        System.out.println(predicateCheckBlank.test("Farrel"));
        System.out.println(predicateCheckBlank.test(""));

        // lambda version
        Predicate<String> predicateCheckBlank2 = s -> s.isBlank();
        System.out.println(predicateCheckBlank2.test("Farrel"));
        System.out.println(predicateCheckBlank2.test(""));

        // method reference version
        Predicate<String> predicateCheckBlank3 = String::isBlank;
        System.out.println(predicateCheckBlank3.test("Farrel"));
        System.out.println(predicateCheckBlank3.test(""));

    }
}
