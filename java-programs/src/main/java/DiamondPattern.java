public class DiamondPattern {
    public static void main(String[] args) {
        int n =4;
        for (int i = 0; i < n; i++) {
            for (int j = (n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("a ");
            }

            System.out.println();
        }
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j <= (i+1); j++) {
                System.out.print(" ");
            }
            for (int j = (n-i-1); j > 0 ; j--) {
                System.out.print("a ");
            }
            System.out.println();
        }
    }
}
