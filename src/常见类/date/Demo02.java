package 常见类.date;

import java.util.Calendar;

public class Demo02 {
    public static void main(String[] args) {
        //calendar是一个protected的，无法new，getInstance()讲就是实例化。
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime().toLocaleString());
        //获取年份
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int day = instance.get(Calendar.DAY_OF_MONTH);
        //set()    add()


    }
}
