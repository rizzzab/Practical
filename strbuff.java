public class StringBufferHardCodeExample {
    public static void main(String[] args) {
        // Initializing StringBuffer with hardcoded content
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending more content
        stringBuffer.append(" World");

        // Inserting at specific position
        stringBuffer.insert(6, "Beautiful ");

        // Deleting characters
        stringBuffer.delete(11, 14); // Removes "ful"

        // Replacing characters
        stringBuffer.replace(7, 8, ",");

        // Converting to String and printing
        String result = stringBuffer.toString();
        System.out.println(result);
    }
}

