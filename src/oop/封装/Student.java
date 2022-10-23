package oop.封装;
//属性私有 get/set private:私有
/*
1、提高程序的安全性，保护数据；
2、隐藏代码的实现细节；
3、统一接口；
4、提高系统可维护性
 */
public class Student {
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private char sex;
    //学习（）
    //睡觉（）
    //get获得这个数据
    //set赋值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
