package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List子接口的使用
 * 特点：有序、有下标 可以重复
 *
 */
public class listDemo01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("apple");
        list.add("xiaomi");
        list.add(0,"huawei");
        System.out.println(list.toString());
        System.out.println(list.toString());
        //遍历
        //for 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //增强for
        for (Object o : list) {
            System.out.println(o);
        }
        //使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用列表迭代器listIterator
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println(list.indexOf("huawei"));


    }
}
