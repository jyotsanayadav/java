interface Payment {
    void payAmount(double amount);
}

class CreditCard implements Payment {
    public void payAmount(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class DebitCard implements Payment {
    public void payAmount(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

class UPI implements Payment {
    public void payAmount(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class InterfacePayment {
    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new DebitCard();
        Payment p3 = new UPI();

        p1.payAmount(500);
        p2.payAmount(1000);
        p3.payAmount(200);
    }
}