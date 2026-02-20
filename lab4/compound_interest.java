public class compound_interest {
    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        int time = 2;

        double amount = principal * Math.pow((1 + rate / 100), time);
        double CI = amount - principal;

        System.out.println("Compound Interest = " + CI);
    }
}
