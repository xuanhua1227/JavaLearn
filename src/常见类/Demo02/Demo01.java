package 常见类.Demo02;

public class Demo01 {
    public static void main(String[] args) {
        int num = 10;
        //类型转换：装箱，基本类型转成引用类型的过程
        int num1 = 18;
        //使用Interger类创建对象
        Integer integer1 = new Integer(num1);
        Integer integer2 = Integer.valueOf(num1);
        System.out.println(integer2.toString());
        //类型转换：拆箱，引用类型转成基本类型
        Integer integer3 = new Integer(100);
        int i = integer3.intValue();
        //jdk1.5之后，可以自动装箱和拆箱
        Integer integer4 = num1;
        //自动装箱本质上就是：Integer integer4 = Integer.valueOf(num1)

    }
}
