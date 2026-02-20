public class decimaltobinary {
    public static String decToBin(int n) {
        int pow=0;
        int binNum=0;
        while(n>0){
            int lastDigit=n%2;
            binNum=binNum+(lastDigit*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        return String.valueOf(binNum);
    }
}