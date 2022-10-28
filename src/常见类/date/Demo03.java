package 常见类.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Demo03 {
    public static void main(String[] args) {
         //1、创建SimpleDateFormat对象 y年 M月
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        //2、创建Date
        Date date = new Date();
        //格式化date（把日期转为字符串）
        String format = sdf.format(date);
        System.out.println(format);
        //解析
        try {
            Date date1 = sdf1.parse("1999/10/24");
            System.out.println(sdf1.format(date1));
        }catch (ParseException e){
            System.out.println("异常");
        }


    }
}
