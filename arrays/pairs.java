public class pairs {
    //nested loops
    //like join first element with all other elements
    //then move to second element and repeat
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){ - i+1 to avoid duplicate pairs
    //         System.out.println(arr[i] + " " + arr[j]);
    //     }
    // }
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("("+current+", "+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
}
// if number of total pairs are asked then in starting before for loop make a variable count=0, let's say tp=0;
// then inside inner for loop do tp++;
// or tp= n*(n-1)/2; where n is length of array
// as first there will be n-1 pairs with first element, then n-2 with second element and so on