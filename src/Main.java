public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to our AI AUTOMATION application!");
        Button printButton = new Button("Print Dollar Signs");
        printButton.setOnAction(e -> {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        });
    }
}