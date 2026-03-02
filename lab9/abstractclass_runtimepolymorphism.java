abstract class Bank {
    abstract int getInterestRate();
}

class SBI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 8;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 9;
    }
}

public class abstractclass_runtimepolymorphism {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getInterestRate());
    }
}