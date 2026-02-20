public class overflow {
    public static void main(String[] args) {

        int num = Integer.MAX_VALUE;

        if (num > Integer.MAX_VALUE / 2 || 
            num < Integer.MIN_VALUE / 2) {
            System.out.println("Overflow will occur");
        } else {
            System.out.println("Safe to multiply");
        }
    }
}

