public class PrimeNumberV4 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 20;
//        System.out.println(Math.sqrt(8));
        System.out.println("List of prime numbers between "+n1+" and "+n2);
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)){
                System.out.println(i+" is a prime number");
            }
        }
    }

    private static boolean isPrime(int i) {
        if (i<=1){
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
           if (i%j==0){
               return false;
           }
        }
        return true;
    }
}
