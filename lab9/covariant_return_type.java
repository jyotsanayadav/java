class Animal {
    Animal getObject() {
        System.out.println("Returning Animal");
        return this;
    }
}

class Dog extends Animal {
    Dog getObject() {   
        System.out.println("Returning Dog");
        return this;
    }
}

public class covariant_return_type {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.getObject();
    }
}