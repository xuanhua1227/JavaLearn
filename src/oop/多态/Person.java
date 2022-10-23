package oop.多态;
/*
1、多态是方法的多态，属性没有多态；
2、父类子类有联系   类型转换一场！ ClassCastException
3、存在条件：继承关系，方法需要重写,父类引用指向子类对象！   father f1 = new Song()；
        static  方法， 属于类，不属于实例，不能重写
        final   常量： 不能重写
        private 私有： 不能重写
 */
public class Person {
    public void run() {
        System.out.println("parent");
    }

}
