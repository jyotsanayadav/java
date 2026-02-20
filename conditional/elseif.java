public class elseif {
    public static void main(String args[]){
        int number = 15;
        if(number > 0){
            System.out.println(number + " is positive");
        } else if(number < 0){
            System.out.println(number + " is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
