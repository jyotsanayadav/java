abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is turned on");
    }
}

class WashingMachine extends Appliance {
    void turnOn() {
        System.out.println("Washing Machine is running");
    }
}

class Refrigerator extends Appliance {
    void turnOn() {
        System.out.println("Refrigerator is cooling");
    }
}

public class AbstractclassAppliance {
    public static void main(String[] args) {

        Appliance a1 = new Fan();
        Appliance a2 = new WashingMachine();
        Appliance a3 = new Refrigerator();

        a1.turnOn();
        a2.turnOn();
        a3.turnOn();
    }
}