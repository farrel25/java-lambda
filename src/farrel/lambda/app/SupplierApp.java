package farrel.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // anonymous class version
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Farrel";
            }
        };
        System.out.println(supplier.get());

        // lambda version
        Supplier<String> supplier2 = () -> "Farrel";
        System.out.println(supplier2.get());

    }
}
