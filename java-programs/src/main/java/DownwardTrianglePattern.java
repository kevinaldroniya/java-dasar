public class DownwardTrianglePattern {
    public static void main(String[] args) {
        int n =5;
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("a ");
//            }
//            System.out.println();
//        }

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("a"+"  ");
            }
            System.out.println();
        }
    }
}
