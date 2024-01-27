public class PrimeNumberV2 {
    public static void main(String[] args) {
        primeCheck(15);
    }

    private static void primeCheck(int i) {
        int m=0;
        int flag=0;
        m=i/2;
        if (i==0 || i==1){
            System.out.println(i+" is not a prime number");
        }else{
            for (int j = 2; j <= m; j++) {
                System.out.println(i+" is not a prime number");
                flag=1;
                break;
            }
            if (flag==0){
                System.out.println(i+" is a prime number");
            }
        }
    }
}
