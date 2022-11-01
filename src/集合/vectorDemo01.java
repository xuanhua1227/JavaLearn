package 集合;

import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo01 {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        vector.add("xigua");
        vector.add("xua");
        vector.add("igua");
        System.out.println(vector);
        //使用枚举器
        Enumeration<Object> elements = vector.elements();
        while (elements.hasMoreElements()){
            String o =(String) elements.nextElement();
            System.out.println(o);
        }
        System.out.println(vector.firstElement());
    }
}
