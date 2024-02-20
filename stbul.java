public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Appending strings to the StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");

        // Inserting a string at a specific position
        stringBuilder.insert(5, " Java");

        // Deleting characters from the StringBuilder
        stringBuilder.delete(5, 10);

        // Replacing characters in the StringBuilder
        stringBuilder.replace(5, 6, ",");

        // Converting StringBuilder to String
        String result = stringBuilder.toString();

        // Printing the result
        System.out.println(result);
    }
}

