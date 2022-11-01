package 集合;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class listDemo02 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList<>();
        //添加数值数据(自动装箱)
        list.add(20);
        list.add(15);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.size());
        System.out.println(list.toString());
        //删除操作
        list.remove((Object)20);
        list.remove(new Integer(20));
        //补充方法sublist，返回子集和
        List list1 = list.subList(1, 3);
        System.out.println(list1);


    }
}
