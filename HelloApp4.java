public class HelloApp4 {
    public static void main(String[] args) {

        String name;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        } else {
            // Default value
            name = "World";
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}