package set_01;

import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        Person zhangsan = new Person("zhangsan", 15);
        Person lisi = new Person("lisi", 17);
        Person wangwu = new Person("wangwu", 11);
        treeSet.add(zhangsan);
        treeSet.add(lisi);
        treeSet.add(wangwu);
        System.out.println(treeSet.toString());
    }
}
