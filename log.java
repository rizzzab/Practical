public class LogicalOperatorExample {
    public static void main(String[] args) {
        // Logical AND (&&) operator
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND (&&) operator:");
        System.out.println("a && b: " + (a && b));  // false

        // Logical OR (||) operator
        System.out.println("\nLogical OR (||) operator:");
        System.out.println("a || b: " + (a || b));  // true

        // Logical NOT (!) operator
        System.out.println("\nLogical NOT (!) operator:");
        System.out.println("!a: " + (!a));  // false
        System.out.println("!b: " + (!b));  // true
    }
}

