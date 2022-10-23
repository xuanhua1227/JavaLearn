package grammar.struct;

public class forDemo03 {
    
    public static void main(String[] args) {
        /*
        print 输出完不换行
        println 输出完换行
         */
        //打印99乘法表

        /*
        1.我们先打印第一列
        2.把固定的值用循环替换
        3.去除重复项
        4.调整样式
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1;  j<= i;  j++) {
                System.out.print(j+"*"+i+"="+(i*j) + "\t");
            }
            System.out.println();

        }
    }
    


}
