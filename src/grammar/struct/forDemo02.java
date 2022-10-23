package grammar.struct;

public class forDemo02 {
    public static void main(String[] args) {
        //计算100以内奇数与偶数的和
        int oddSum = 0;//奇数的和
        int evenSum = 0;//偶数的和

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }
        System.out.println(oddSum + " " + evenSum);

    }
}
