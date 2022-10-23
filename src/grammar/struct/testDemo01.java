package grammar.struct;

public class testDemo01 {
    public static void main(String[] args) {
        //打印三角形
        for (int i = 1; i <= 10; i++) {
            //打印三角形左半部分

            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //=======================================
            //打印三角形右半部分
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
