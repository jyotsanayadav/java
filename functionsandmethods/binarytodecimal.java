public class binarytodecimal {
    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("The decimal value is: " + decNum);
    }   
}