package set_01;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo05 {
    public static void main(String[] args) {
        //使用匿名内部类，Comparator实现定制比较
        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getName().compareTo(o2.getName());
                int n2 = o1.getAge() - o2.getAge();
                return n1 == 0 ? n2 : n1;
            }
        });


    }
}
