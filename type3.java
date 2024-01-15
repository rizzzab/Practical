class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child's display method");
    }

    void childMethod() {
        System.out.println("Child's method");
    }
}

public class TypeCastingAdvancedExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();

        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.display();
            child.childMethod();
        }
    }
}
