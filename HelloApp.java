public class HelloApp {
    public static void main(String[] args) {
        String word = "World";
        if (args.length > 0) {
            word = args[0];
        }
        System.out.println("Hello, " + word + "!");
    }
}
