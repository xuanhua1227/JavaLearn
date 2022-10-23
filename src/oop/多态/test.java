package oop.多态;
//静态导入包
//final修饰的类不能被继承
import static java.lang.Math.random;
public class test {
    public static void main(String[] args) {
        //object>person>student
        Object o = new Student();
        System.out.println(o instanceof Student);
        System.out.println(o instanceof Person);
        System.out.println(o instanceof Object);
        System.out.println(o instanceof teacher);

    }
}
