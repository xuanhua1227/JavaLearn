package 常见类.可变字符串;

/**
 * StringBuilder 和 StringBuffer 的功能是一样的
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        /*
        验证StringBuilder的效率高于String
         */
        //获取开始时间
        long start = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 99999; i++) {
            string+=i;
        }
        System.out.println(string);
        long end = System.currentTimeMillis();
        System.out.println("time: "+(end-start));

        long start1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 99999; i++) {
            stringBuilder.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("time: "+(end1-start1));

    }

}
