package farrel.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Farrel");
        sayHello(null);
    }

    public static void sayHello(String name) {

        // WITHOUT OPTIONAL
//        String nameUpperCase = name.toUpperCase();
//        System.out.println("HELLO " + nameUpperCase);



        // MANUAL NULL CHECK
//        if (name != null) {
//            String nameUpperCase = name.toUpperCase();
//            System.out.println("HELLO " + nameUpperCase);
//        }



        // USING OPTIONAL
//        Optional<String> nameOptional = Optional.ofNullable(name);
//
//
//        // ANONYMOUS CLASS
////        Optional<String> nameUpperCase = nameOptional.map(new Function<String, String>() {
////            @Override
////            public String apply(String name2) {
////                return name2.toUpperCase();
////            }
////        });
//
//        // LAMBDA
////        Optional<String> nameUpperCase = nameOptional.map(name2 -> name2.toUpperCase());
//
//        // METHOD REFERENCE
//        Optional<String> nameUpperCase = nameOptional.map(String::toUpperCase);
//
//
//        // ANONYMOUS CLASS
////        nameUpperCase.ifPresent(new Consumer<String>() {
////            @Override
////            public void accept(String name) {
////                System.out.println("HELLO " + name);
////            }
////        });
//
//        // LAMBDA
//        nameUpperCase.ifPresent(name1 -> System.out.println("HELLO " + name1));



        // OPTIONAL COMBINATION IN ONE LINE
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));



        // OPTIONAL USING ifPresentOrElse
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );



        // OPTIONAL USING orElse
        String nameUpperCase = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + nameUpperCase);
    }
}
