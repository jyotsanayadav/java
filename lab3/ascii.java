import java.io.*;

public class ascii {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a character: ");
        char ch = (char) br.read();

        int ascii = (int) ch;
        System.out.println("ASCII value: " + ascii);
    }
}

