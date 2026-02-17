import java.util.Scanner;

public class PrefixSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter prefix: ");
        String prefix = sc.nextLine();

        System.out.print("Enter suffix: ");
        String suffix = sc.nextLine();

        System.out.println("Starts with prefix: " + str.startsWith(prefix));
        System.out.println("Ends with suffix: " + str.endsWith(suffix));
    }
}
