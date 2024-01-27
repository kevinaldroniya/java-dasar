public class PyramidPattern {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i <= n; i++) {
            for (int j = (n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.println();
        }
    }
}
