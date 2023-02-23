package farrel.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("firstName", "Farrel");
        names.put("middleName", "Athaillah");
        names.put("lastName", "Putra");

        // BASIC FOR LOOP
        for ( Map.Entry<String, String> name : names.entrySet()) {
            System.out.println(name.getKey() + " : " + name.getValue());
        }

        // FOR EACH ANONYMOUS CLASS
        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        // FOR EACH LAMBDA
        names.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
