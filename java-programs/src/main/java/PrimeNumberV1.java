public class PrimeNumberV1 {

    public static void main(String[] args) {
        int m = 0;
        int flag=0;
        int n=8; // it is the number to be checked
        m=n/2;
        if (n==0||n==1){
            System.out.println(n+" is not a prime number");
        }else {
            for (int j = 2; j <= m; j++) {
                if (n%j==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }

}
