package grammar.struct;

public class forDemo1 {
    public static void main(String[] args) {
        int a = 1;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //100.for 可直接出循环
        for (int i = 0; i < 100; i++) {
        }
        //for(;;)死循环
        for (; ; ) {
        }
    }
}