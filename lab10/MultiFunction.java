interface Printer {
    void print();
}

interface Scanner {
    void scan();
}
class MultiFunctionPrinter implements Printer, Scanner {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class MultiFunction {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();

        mfp.print();
        mfp.scan();
    }
}