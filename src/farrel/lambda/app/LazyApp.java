package farrel.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {

        // NOT LAZY
//        testScore(60, getName());



        // LAZY

        // anonymous class
        testScore(60, new Supplier<String>() {
            @Override
            public String get() {
                return getName();
            }
        });

        // lambda
        testScore(60, () -> getName());

        // method reference
        testScore(60, LazyApp::getName);
    }

    // NOT LAZY
//    public static void testScore(int score, String name) {
//        if (score > 80) {
//            System.out.println("Selamat " + name + ", anda lulus");
//        } else {
//            System.out.println("Coba lagi tahun depan");
//        }
//    }

    // LAZY
    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", anda lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Farrel";
    }
}
