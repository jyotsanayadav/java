class Parent {
    static void show() {
        System.out.println("Parent Static Method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child Static Method");
    }
}

public class overriding_hiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();   // Parent method called

        Child c = new Child();
        c.show();   // Child method called
    }
}