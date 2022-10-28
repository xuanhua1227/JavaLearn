package 常见类.字符串类;

public class Demo01 {
    public static void main(String[] args) {
        String name = "hello"; //“hello”存储在字符串池中
        name = "zhangsan";//把"zhangsan"赋值给name，*并不是将hello更改为zhangsan，而是在字符串池中重新创建了zhangsan*
        String name2 = "zhangsan";
        System.out.println(name2==name);
        String str = new String("Java is the best language!!!");
        System.out.println(str);
        System.out.println("==============================");
        String s = " a b c d e f";
        System.out.println(s);
        s.replace(""," ");
        System.out.println(s);


    }
}
