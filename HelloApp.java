public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        // String name = "World";
        if (args.length > 0) {

            for (String name: args) {
                nameBuilder.append(name).append(", ");
            }
                nameBuilder.delete(nameBuilder.length() - 2, nameBuilder.length());

        }
        else{
            nameBuilder.append("World");
        }
        System.out.println("Hello, " + nameBuilder.toString().trim() + "!");
    }
}
