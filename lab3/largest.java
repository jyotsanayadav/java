import java.io.*;

public class Q3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int largest = a;

        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        System.out.println("Largest = " + largest);
    }
}
