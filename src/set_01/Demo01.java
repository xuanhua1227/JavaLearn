package set_01;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试Set接口的使用
 * 特点：（1）无序、没有下标（2）不能重复
 */
public class Demo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("xiaohua");
        set.add("huahua");


    }
}
