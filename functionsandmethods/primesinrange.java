public class primesinrange {
    public static void primesinrange(int n){
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
