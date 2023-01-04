package farrel.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // Anonymous class version
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Farrel");

        // lambda version
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer2.accept("Farrel");

        // method reference version
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Farrel");

    }
}
