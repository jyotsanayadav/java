class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 4, breadth = 6;

    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Shape {
    int base = 5, height = 4;

    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class dynamic_method {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};
        
        for (Shape s : shapes) {
            s.area();   
        }
    }
}
