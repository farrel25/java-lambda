package farrel.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // Anonymous class version
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(functionLength.apply("Farrel"));

        // lambda version
        Function<String, Integer> functionLength2 = s -> s.length();
        System.out.println(functionLength2.apply("Farrel"));

        // method reference version
        Function<String, Integer> functionLength3 = String::length;
        System.out.println(functionLength3.apply("Farrel"));
    }
}
