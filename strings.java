import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // indexof & lastindexof 
        System.out.print("\nEnter substring to search: ");
        String sub = sc.nextLine();

        System.out.println("First occurrence: " + str.indexOf(sub));
        System.out.println("Last occurrence: " + str.lastIndexOf(sub));

        //  Replace character 
        System.out.print("\nEnter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        sc.nextLine(); 

        String replaced = str.replace(oldChar, newChar);
        System.out.println("After replacement: " + replaced);

        // Substring 
        System.out.print("\nEnter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();
        sc.nextLine();

        System.out.println("Substring from index: " + str.substring(start));
        System.out.println("Substring between indices: " + str.substring(start, end));

        // Case conversion & trim 
        System.out.print("\nEnter string with spaces: ");
        String spaced = sc.nextLine();

        System.out.println("Uppercase: " + spaced.toUpperCase());
        System.out.println("Lowercase: " + spaced.toLowerCase());
        System.out.println("Trimmed: " + spaced.trim());

        //  == vs equals()
        String a = "Hello";
        String b = new String("Hello");

        System.out.println("\nUsing == : " + (a == b));   
        System.out.println("Using equals(): " + a.equals(b)); 

        System.out.println("Explanation:");
        System.out.println("== compares memory reference.");
        System.out.println("equals() compares actual content.");

        //   String Immutability 
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("\nOriginal String: " + original);
        System.out.println("Modified String: " + modified);
        System.out.println("Original not changed (String is immutable)");

        //   StringBuffer Operations 
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("\nAfter append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        //  StringBuffer replace 
        StringBuffer sentence = new StringBuffer("I love Java");
        sentence.replace(7, 11, "Python");
        System.out.println("\nAfter replace: " + sentence);

        // StringBuilder Reverse
        System.out.print("\nEnter string to reverse: ");
        String input = sc.nextLine();

        StringBuilder sbuilder = new StringBuilder(input);
        sbuilder.reverse();

        String reversedString = sbuilder.toString();

        System.out.println("Reversed using StringBuilder: " + reversedString);
    }
}
