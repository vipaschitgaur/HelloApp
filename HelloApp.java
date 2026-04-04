public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        // String name = "World";
        boolean first = true;

        for (String name : args) {
            nameBuilder.append (name);
            nameBuilder.append (", ");
        }

        if (nameBuilder.length() == 0) {
            nameBuilder.append("World");
        }
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);
        System.out.println("Hello, " + names + "!");
}
}
