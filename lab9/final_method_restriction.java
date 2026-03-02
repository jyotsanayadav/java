class Base {
    final void display() {
        System.out.println("Final Method");
    }
}

class Derived extends Base {
    // void display() { }   -- ERROR
}
