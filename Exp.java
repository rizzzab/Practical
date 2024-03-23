public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling arithmetic exception
            System.out.println("Error: Division by zero");
        } finally {
            // Code that always executes, regardless of whether an exception occurred
            System.out.println("End of program");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
