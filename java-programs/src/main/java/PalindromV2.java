public class PalindromV2 {
    public static void main(String[] args) {
        String original = "LOL";
        StringBuilder reverse = new StringBuilder();

        for (int i = original.length()-1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }

        if (original.contentEquals(reverse)){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }
}
