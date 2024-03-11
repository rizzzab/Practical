public class UnaryOperatorExample {
    public static void main(String[] args) {
        int x = 5;
        int y = -x; // Unary minus
        System.out.println("Unary minus: " + y); // Output: -5
        
        y = +x; // Unary plus (not really necessary)
        System.out.println("Unary plus: " + y); // Output: 5
        
        y++; // Increment
        System.out.println("Increment: " + y); // Output: 6
        
        y--; // Decrement
        System.out.println("Decrement: " + y); // Output: 5
        
        boolean flag = true;
        boolean notFlag = !flag; // Logical complement
        System.out.println("Logical complement: " + notFlag); // Output: false
        
        int num = 42;
        int bitwiseComplement = ~num; // Bitwise complement
        System.out.println("Bitwise complement: " + bitwiseComplement); // Output: -43
    }
}
