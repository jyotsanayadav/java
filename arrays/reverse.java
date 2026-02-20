public class reverse {
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
}
