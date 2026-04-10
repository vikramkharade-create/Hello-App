public class HelloApp6 {

    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names;

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                names = "";
            }

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}