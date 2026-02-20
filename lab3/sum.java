import java.io.*;

public class sum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Sum = " + (a + b));
    }
}
