public class DownTrianglePattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
//                System.out.print("* ");
                if (j==i||j==n-1||i==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
