package oop.demo01;

public class Application {
    public static void main(String[] args) {
        //类：抽象的，实例化
        Student ming = new Student();
        Student hong = new Student("小红", 5);
        ming.name = "小明";
        ming.study();
        hong.study();
    }
}
