public class FactorialV1 {
    public static void main(String[] args) {
        int i,fact=1;
        int n =4;
        for (int j = 1; j <= n; j++) {
            fact*=j;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
