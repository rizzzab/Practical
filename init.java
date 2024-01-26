public class InitializationBlocksExample {
    private int instanceVar;
    private static int staticVar;

    // Instance initialization block
    {
        instanceVar = 10;
        System.out.println("Instance initialization block executed. instanceVar = " + instanceVar);
    }

    // Static initialization block
    static {
        staticVar = 20;
        System.out.println("Static initialization block executed. staticVar = " + staticVar);
    }

    // Constructor
    public InitializationBlocksExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        InitializationBlocksExample obj = new InitializationBlocksExample();
    }
}


