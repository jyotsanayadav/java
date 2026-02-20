public class ternary {
    public static void main(String args[]){
        int a = 10, b = 20;
        int max;

        // Using ternary operator to find maximum of two numbers
        max = (a > b) ? a : b;

        System.out.println("The maximum value is: " + max);
    }
}

//variable = condition ? value_if_true : value_if_false;
