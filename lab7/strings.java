import java.util.*;

public class strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n------ STRING MENU ------");
            System.out.println("1. Create Strings (Literal, new, Char Array)");
            System.out.println("2. Find Length of String");
            System.out.println("3. Print Each Character");
            System.out.println("4. Concatenate Strings");
            System.out.println("5. Compare Strings");
            System.out.println("6. Check Prefix and Suffix");
            System.out.println("7. First & Last Occurrence of Substring");
            System.out.println("8. Replace Character");
            System.out.println("9. Extract Substring");
            System.out.println("10. Uppercase, Lowercase, Trim");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                //  Create Strings
                case 1:
                    String s1 = "Hello";   // Literal
                    String s2 = new String("World"); // new keyword
                    char[] ch = {'J','a','v','a'};
                    String s3 = new String(ch); // from char array

                    System.out.println("String Literal: " + s1);
                    System.out.println("Using new: " + s2);
                    System.out.println("From Char Array: " + s3);
                    break;

                //  Length of String
                case 2:
                    System.out.print("Enter string: ");
                    String str = sc.nextLine();
                    System.out.println("Length = " + str.length());
                    break;

                //  Print Each Character
                case 3:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();

                    for (int i = 0; i < str.length(); i++)
                        System.out.println(str.charAt(i));
                    break;

                //  Concatenate
                case 4:
                    System.out.print("Enter first string: ");
                    String a = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String b = sc.nextLine();

                    System.out.println("Using concat(): " + a.concat(b));
                    System.out.println("Using + operator: " + a + b);
                    break;

                //  Compare Strings
                case 5:
                    System.out.print("Enter first string: ");
                    String sA = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String sB = sc.nextLine();

                    System.out.println("equals(): " + sA.equals(sB));
                    System.out.println("compareTo(): " + sA.compareTo(sB));
                    break;

                //  Prefix & Suffix
                case 6:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.print("Enter prefix: ");
                    String pre = sc.nextLine();
                    System.out.print("Enter suffix: ");
                    String suf = sc.nextLine();

                    System.out.println("Starts with prefix? " + str.startsWith(pre));
                    System.out.println("Ends with suffix? " + str.endsWith(suf));
                    break;

                //  First & Last Occurrence
                case 7:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.print("Enter substring: ");
                    String sub = sc.nextLine();

                    System.out.println("First index: " + str.indexOf(sub));
                    System.out.println("Last index: " + str.lastIndexOf(sub));
                    break;

                //  Replace Character
                case 8:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.next().charAt(0);
                    System.out.print("Enter new character: ");
                    char newChar = sc.next().charAt(0);

                    String replaced = str.replace(oldChar, newChar);
                    System.out.println("After Replacement: " + replaced);
                    break;

                //  Extract Substring
                case 9:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();

                    System.out.println("Substring from index: " + str.substring(start));
                    System.out.println("Substring between indices: " + str.substring(start, end));
                    break;

                // Uppercase, Lowercase, Trim
                case 10:
                    System.out.print("Enter string with spaces: ");
                    str = sc.nextLine();

                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    System.out.println("Trimmed: " + str.trim());
                    break;

                case 11:
                    System.exit(0);
            }
        }
    }
}
