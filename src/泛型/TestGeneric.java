package 泛型;

public class TestGeneric {
    public static void main(String[] args) {

        //使用泛型类创建对象
        //注意：1、泛型只能使用引用类型 2、不同泛型对象之间不能相互赋值
        myGeneric<String> generic = new myGeneric<String>();
        generic.t="hello";
        generic.show("hello,world!!");
        String string = generic.getT();
        System.out.println(string);


        //泛型接口
        MyInterface impl = new MyGenericImpl();
        impl.server("hello");
        MyInterfaceImpl2<Integer> myInterfaceImpl2 = new MyInterfaceImpl2<>();
        myInterfaceImpl2.server(15);

        //泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("hello");
        myGenericMethod.show(200);

    }
}
