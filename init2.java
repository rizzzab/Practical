public class InitializationExample {
    private int instanceVar;
    private static int staticVar;

    // Static initialization block
    static {
        staticVar = 100;
        System.out.println("Static initialization block executed. staticVar = " + staticVar);
    }

    // Instance initialization block
    {
        instanceVar = 50;
        System.out.println("Instance initialization block executed. instanceVar = " + instanceVar);
    }

    // Constructor
    public InitializationExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        InitializationExample obj1 = new InitializationExample();
        System.out.println("-------");
        InitializationExample obj2 = new InitializationExample();
    }
}

