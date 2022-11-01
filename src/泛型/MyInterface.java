package 泛型;

/**
 * 泛型接口
 * 语法
 *：接口名<T>
 *  注意：不能泛型静态常量
 */

public interface MyInterface<T> {
    String name = "xuanhua";
    //T t ，T t = new T()是不可以的
    T server(T t);
}
