abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // Abstract method

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() { // Implementing abstract method
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() { // Implementing abstract method
        System.out.println(name + " says Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
