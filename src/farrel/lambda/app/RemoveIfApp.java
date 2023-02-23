package farrel.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Farrel", "Athaillah", "Putra"));

        // BASIC FOR LOOP (will be showing error ConcurrentModificationException)
//        for (String name : names) {
//            if (name.length() > 5) {
//                names.remove(name);
//            }
//        }

        // REMOVEIF ANONYMOUS CLASS
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.length() > 5;
//            }
//        });

        // REMOVEIF LAMBDA
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
