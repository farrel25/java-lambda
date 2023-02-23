package farrel.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Farrel", "Athaillah", "Putra");

        // BASIC FOR LOOP
        for (String name : list) {
            System.out.println(name);
        }

        // FOR EACH ANONYMOUS CLASS
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // FOR EACH LAMBDA
        list.forEach(s -> System.out.println(s));

        // FOR EACH METHOD REFERENCE
        list.forEach(System.out::println);
    }
}
