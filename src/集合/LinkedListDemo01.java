package 集合;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 链表结构实现
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        //本质上其实是一个双向链表
        LinkedList<Object> linkedList = new LinkedList<>();
        Student zhangsan = new Student("zhangsan", 20);
        Student lisi = new Student("lisi", 15);
        Student wangwu = new Student("wangwu", 40);
        linkedList.add(zhangsan);
        linkedList.add(lisi);
        linkedList.add(wangwu);
        linkedList.add(lisi);
        System.out.println(linkedList.size());
        ListIterator<Object> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            Student o = (Student) listIterator.next();
            System.out.println(o.toString());
        }
    }
}
