package set_01;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo03 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ee");
        treeSet.add("cc");
        treeSet.add("aa");
        treeSet.add("bb");
        treeSet.add("dd");
        //增强for
        for (String s : treeSet) {
            System.out.println(s);
        }
        //迭代器
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
