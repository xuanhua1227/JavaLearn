package oop.继承;
//在Java中，所有的类都直接或间接继承自Object类，只可以单继承不可以多继承（一个儿子只能有一个爸爸，一个爸爸可以有多个儿子）
//Student is Person 继承
//Teacher is Person 继承
/*
    extends 的意思是“拓展”,子类是父类的拓展；
    继承是类与类之间的关系，除此之外，还有依赖、组合、聚合等；
 */
//子类继承父类就会拥有父类的全部方法；
//父类私有的是无法继承的

public class Student extends Person{
    //ctrl + H


    public Student() {
        //super（）隐藏了
        System.out.println("Student被调用");
    }
}
