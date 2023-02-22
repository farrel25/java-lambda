package farrel.lambda.app;

import farrel.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {

        // USING STATIC METHOD

        // Anonymous class version
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return StringUtil.isLowerCase(s);
            }
        };
        System.out.println(predicateIsLowerCase.test("faRrel"));
        System.out.println(predicateIsLowerCase.test("farrel"));

        // lambda version
        Predicate<String> predicateIsLowerCase2 = value -> StringUtil.isLowerCase(value);
        System.out.println(predicateIsLowerCase2.test("faRrel"));
        System.out.println(predicateIsLowerCase2.test("farrel"));

        // method reference version
        Predicate<String> predicateIsLowerCase3 = StringUtil::isLowerCase;
        System.out.println(predicateIsLowerCase3.test("faRrel"));
        System.out.println(predicateIsLowerCase3.test("farrel"));





        // METHOD REFERENCE USING METHOD FROM PARAMETER

        // Anonymous class version
        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(functionUpper.apply("farrel"));

        // lambda version
        Function<String, String> functionUpper2 = s -> s.toUpperCase();
        System.out.println(functionUpper2.apply("farrel"));

        // method reference version
        Function<String, String> functionUpper3 = String::toUpperCase;
        System.out.println(functionUpper3.apply("farrel"));
    }



    public void run() {

        // USING NON STATIC METHOD

        // Anonymous class version
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //return MethodReferenceApp.this.isLowerCase(s);
                return isLowerCase(s);
            }
        };
        System.out.println(predicateIsLowerCase.test("faRrel"));
        System.out.println(predicateIsLowerCase.test("farrel"));

        // lambda version
        //Predicate<String> predicateIsLowerCase2 = s -> MethodReferenceApp.this.isLowerCase(s);
        Predicate<String> predicateIsLowerCase2 = s -> isLowerCase(s);
        System.out.println(predicateIsLowerCase2.test("faRrel"));
        System.out.println(predicateIsLowerCase2.test("farrel"));

        // method reference version
        //Predicate<String> predicateIsLowerCase3 = MethodReferenceApp.this::isLowerCase;
        Predicate<String> predicateIsLowerCase3 = this::isLowerCase;
        System.out.println(predicateIsLowerCase3.test("faRrel"));
        System.out.println(predicateIsLowerCase3.test("farrel"));

    }

    public void run2() {

        // Method reference using non-static method from other Object

        // what if the method that we want to use is from another object? just do it like below
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase4 = app::isLowerCase;
        System.out.println(predicateIsLowerCase4.test("faRrel"));
        System.out.println(predicateIsLowerCase4.test("farrel"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
