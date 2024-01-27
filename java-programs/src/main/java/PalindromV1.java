public class PalindromV1 {
    public static void main(String[] args) {
        int r,sum = 0;
        int temp;
        int n= 252;
        temp=n;

        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }
}
