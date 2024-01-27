public class PrimeNumberV3 {
    public static void main(String[] args) {
        int n =6;
        if (isPrime(n)){
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not a prime number");
        }
    }

    private static boolean isPrime(int i) {
        if (i<1){
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i) ; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
