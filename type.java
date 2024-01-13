public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // Automatically converts int to double
        System.out.println("Implicit Casting - int to double: " + doubleValue);

        // Explicit casting (Narrowing Conversion)
        double doubleNum = 15.75;
        int intNum = (int) doubleNum; // Manually converts double to int
        System.out.println("Explicit Casting - double to int: " + intNum);

        // Casting with objects (Upcasting and Downcasting)
        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal; // Downcasting
        animal.eat(); // Calls Dog's eat method
        dog.bark(); // Calls Dog's bark method
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
