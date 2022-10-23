package grammar.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        int a  = demo04.test(10);
        System.out.println(a);

    }
    //5!阶乘 递归
    /*
    边界条件
    前阶段
    返回阶段
     */
    public int test(int n){
        if (n==1){
            return 1;
        }else {
            return n*test(n-1);
        }

    }
}
