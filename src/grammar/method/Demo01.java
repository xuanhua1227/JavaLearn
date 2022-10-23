package grammar.method;

public class Demo01 {
    public static void main(String[] args) {
        //值传递（Java） 引用传递
        int i = max(10, 20);
        System.out.println(i);
    }

    public static int max(int a, int b) {
        return a > b? a : b;
    }
}
