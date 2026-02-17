public class StringCompare {
    public static void main(String[] args) {

        String str1 = "Apple";
        String str2 = "Apple";
        String str3 = "Banana";

        // equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));

        // compareTo()
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
    }
}
