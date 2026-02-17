public class StringConcat {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // Using concat()
        String result1 = str1.concat(str2);

        // Using + operator
        String result2 = str1 + str2;

        System.out.println("Using concat(): " + result1);
        System.out.println("Using + operator: " + result2);
    }
}
