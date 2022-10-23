package grammar.method;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.test();

    }
    //StackOverFlowError 栈溢出
    public void test(){
        test();
    }
}
