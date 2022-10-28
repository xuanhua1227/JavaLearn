package 常见类.bigdecimal;

import java.math.BigDecimal;

public class demo01 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 0.9;
        System.out.println((a-b));//不是0.1，而是模糊计算
        /*
        BigDecimal提供浮点数的精确运算,返回值类型也是BigDecimal
        a.substract(b)减法
        a.add(b)加法
        a.multiply(b)乘法
        a.divide(b)除法
         */
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        System.out.println(bd1.subtract(bd2));
        BigDecimal r1 = new BigDecimal("10").divide(new BigDecimal("3"),5,BigDecimal.ROUND_HALF_UP);
        System.out.println(r1);
    }
}
