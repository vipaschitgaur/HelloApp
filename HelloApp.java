public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        // String name = "World";
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder. append (", ");}
            nameBuilder.append (name);
            first = false;
        }
        if (nameBuilder.length() == 0) {
            nameBuilder.append("World");
        }
        System.out.println("Hello, " + nameBuilder.toString() + "!");
}
}
