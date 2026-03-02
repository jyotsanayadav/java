interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class DebitCard implements Payment {
    public void pay() {
        System.out.println("Payment through Debit Card");
    }
}

public class runtime_polymorphism_interface {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new DebitCard();
        p.pay();
    }
}