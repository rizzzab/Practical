public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Appending strings to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");

        // Inserting a string at a specific position
        stringBuffer.insert(5, " Java");

        // Deleting characters from the StringBuffer
        stringBuffer.delete(5, 10);

        // Replacing characters in the StringBuffer
        stringBuffer.replace(5, 6, ",");

        // Converting StringBuffer to String
        String result = stringBuffer.toString();

        // Printing the result
        System.out.println(result);
    }
}

