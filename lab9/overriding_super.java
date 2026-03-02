class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        super.display();   // Calls parent method
        System.out.println("This is a Car");
    }
}

public class overriding_super {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}