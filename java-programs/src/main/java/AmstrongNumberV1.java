public class AmstrongNumberV1 {
    public static void main(String[] args) {
        int num=999;
        System.out.println("Amstrong Number up to "+num+" are:");
//        for (int i = 0; i < num; i++) {
//            if (isAmstrong(i)){
//                System.out.print(i+" ");
//            }
//        }

            isAmstrong(153);


    }

    private static boolean isAmstrong(int i) {
        int temp,digits=0,last=0,sum=0;

        temp=i;
        while (temp>0){
            temp=temp/10;
            digits++;
        }

        temp=i;
        while (temp>0){
            last=temp%10;
            sum+= (int) Math.pow(last,digits);
            temp=temp/10;
        }

        if (i==sum){
            return true;
        }else {
            return false;
        }

    }
}
