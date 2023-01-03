package farrel.lambda.app;

import farrel.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // Anonymous class version
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Farrel";
            }
        };
        System.out.println(simpleAction.action());

        // Lambda version
        SimpleAction simpleAction2 = () -> "Farrel";
        System.out.println(simpleAction2.action());
    }
}
