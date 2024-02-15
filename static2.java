public class StaticBlockConstructorExample {
    static int num;
    String message;

    // Static block
    static {
        System.out.println("Static block is initialized.");
        num = 42;
    }

    // Constructor
    public StaticBlockConstructorExample(String msg) {
        message = msg;
        System.out.println("Constructor is initialized with message: " + message);
    }

    // Static method
    public static void display() {
        System.out.println("Value of num: " + num);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        display();

        // Creating an instance of the class
        StaticBlockConstructorExample instance = new StaticBlockConstructorExample("Hello");
    }
}

