import java.util.*;
public class reverse_of_number {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int reverse=0;
        int number= sc.nextInt();
        while (number>0){
        int lastdigit= number%10;
         reverse=(reverse*10)+lastdigit;
         number=number/10;
        }
        System.out.println(reverse);
    }
}
