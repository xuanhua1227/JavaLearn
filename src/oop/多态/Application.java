package oop.多态;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        Student student = new Student();
        Person person = new Person();
        //可以指向的引用类型就不确定了。父类的引用指向子类
        Student student1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();
        student1.run();    //son
        s2.run();          //son


        //对象能执行哪些方法，主要看左边，和右边关系不大



    }
}
