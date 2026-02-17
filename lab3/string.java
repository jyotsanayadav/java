public class String{
    public static void main(String[] args) {

        // Using string literal
        String str1 = "Hello";

        // Using new keyword
        String str2 = new String("World");

        // Using character array
        char[] ch = {'J', 'a', 'v', 'a'};
        String str3 = new String(ch);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}
