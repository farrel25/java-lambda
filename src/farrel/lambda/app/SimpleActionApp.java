package farrel.lambda.app;

import farrel.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // INTRODUCTION TO LAMBDA
//        // Anonymous class version
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Farrel";
//            }
//        };
//        System.out.println(simpleAction.action());
//
//        // Lambda version
//        SimpleAction simpleAction2 = () -> "Farrel";
//        System.out.println(simpleAction2.action());





        // CREATING LAMBDA
        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction3 = value -> {
            return "Hello " + value;
        };

        // Lambda Expression Without Block
        SimpleAction simpleAction4 = (String value) -> "Hello " + value;
        SimpleAction simpleAction5 = (value) -> "Hello " + value;
        SimpleAction simpleAction6 = value -> "Hello " + value;

        System.out.println(simpleAction2.action("Farrel"));
    }
}
