package 泛型;

/**
 * 泛型类
 * 语法：类名<T>
 *     T是类型占位符，表示一种引用类型，只可以是引用类型，可以编写多个，使用逗号隔开
 */
public class myGeneric<T> {
    //使用泛型 T
    //1、创建变量
    T t;
    //2、添加方法,作为方法的参数
    public void show(T t) {

        System.out.println(t);
    }
    //3、使用泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
