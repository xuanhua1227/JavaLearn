package oop.demo01;
//学生类
public class Student {
    /**
     * 构造器：
     * 1、和类名相同
     * 2、没有返回值
     * 作用：
     * 1、new本质就是在调用构造方法
     * 2、初始化对象的值
     * 注意点：
     * 1、定义了有参构造之后，如果想使用无参构造，显示的定义一个无参构造
     * 2、ALT+INSERT
     */
    //属性：字段
    String name; //null
    int age;     //0
    //方法
    //有参构造：一旦定义了有参构造，无参构造就必须显示定义。
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //一个类即使什么都不写，也会存在一个方法
    /*
    实例化初始值
    1.使用new关键字，本质是在调用构造器
     */
    public Student() {
    }
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
