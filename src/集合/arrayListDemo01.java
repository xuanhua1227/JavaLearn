package 集合;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ArrayList的使用
 * 存储结构，数组：查找遍历速度快，增删速度慢
 */
public class arrayListDemo01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        //1、添加元素
        Student zhangsan = new Student("zhangsan", 20);
        Student lisi = new Student("lisi", 15);
        Student wangwu = new Student("wangwu", 40);
        Student st = new Student();
        arrayList.add(zhangsan);
        arrayList.add(lisi);
        arrayList.add(wangwu);
        arrayList.add(st);
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        //2、删除元素
        arrayList.remove(new Student("zhangsan", 20));
        System.out.println(arrayList.size());
//        arrayList.clear();
//        System.out.println(arrayList.size());
        //3、遍历元素
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Student s = (Student) listIterator.next();
            System.out.println(s.toString());
        }
        //4、判断
        System.out.println(arrayList.contains(new Student("lisi", 16)));
        //5、查找
    }
}
