package grammar.method;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.test(1,2,3);

    }
    //int...i可变参数
    public void test(int... i){
        System.out.println(i);
    }
}
